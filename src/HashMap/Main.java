package HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, "Sanjeev");
        map.put(2, "Pandey");
        map.put(6, "Tony Stark");
//        System.out.println(map);

//        to get the value through key
//        System.out.println(map.get(1));

//        to remove the entry
        System.out.println(map.remove(1));
        System.out.println(map);
    }

}
