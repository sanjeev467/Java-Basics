package HashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.SimpleTimeZone;

// i need a class
 class Entry{
     public int key;
     public String value;

     public Entry(int key, String value){
         this.key = key;
         this.value = value;
     }

     public String toString(){
         return key + "=" + value;
     }
}

public class MyHashMap {
    // i need a hashmap, int his haspmap i need a linkedlist array
    // i will use built in linkedlist
    // array of linkedlist and type of node is entry which has a key and value

    LinkedList<Entry>[] list;

    public MyHashMap(){
        this.list = new LinkedList[5]; // initial size is 5
        // this is array of 5 and on each array we have a linked list
    }

    // to put
    public boolean put(int key, String value){
        int index = hashKey(key);
        if(list[index]== null){
            list[index] = new LinkedList<>();
        }
        var bucket = list[index];

        for(var entry : bucket){
            if(entry.key == key){
                entry.value = value;
                return true;
            }
        }
       bucket.addLast(new Entry(key, value));
        return true; // that your value has put up
    }

    // hash function

    private int hashKey(int key){
        return key % list.length;
    }

    // to get the value

    public String get(int key){
        int index = hashKey(key);
        if(list[index] == null) throw new IllegalArgumentException();
        var bucket = list[index];

        for(var entry : bucket){
            if(entry.key == key) return entry.value;
        }

        throw new IllegalArgumentException();
    }

    public String toString(){
        return Arrays.toString(list);
    }


}
