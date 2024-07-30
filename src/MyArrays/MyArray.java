package MyArrays;

public class MyArray {
    private int[] items;
    private int currentIndex;

    // constructor

    public MyArray(int initialSize){
        this.items = new int[initialSize]; // to give initial size
        this.currentIndex = 0;
    }

    // to find or search index of element in the items array

    public int indexOf(int value){
        // linear search

        for(int i = 0; i < this.currentIndex; i++){
            if(this.items[i] == value) return i;

        }
        return -1;
    }

    // function to insert an element in array

    public void insert(int value){
        this.items[currentIndex] = value;
        currentIndex++;
    }

    // to remove element from array
    public void removeAt(int index){
        if(index>=this.currentIndex) throw new IllegalArgumentException();

        for(int i = index; i<= this.currentIndex-2; i++){
            this.items[i] = this.items[i+1];
            currentIndex--;
        }
    }

    // to find maximum element in array

    public int max(){
        // assume first element of array is largest and store it in result
        int result = this.items[0];
        for(int i = 0; i<this.currentIndex; i++){
            if(items[i] > result)
                result = items[i];
        }
        return result;

    }

    // Reverse the array

    public void reverse(){
        int i = 0;
        int j = this.currentIndex-1;

        while(i<j){
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            i++;
            j--;
        }
    }

    // using toString method to print elements of arr in main class

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i< this.currentIndex; i++){
            str.append(this.items[i]).append(", ");

        }
        str.append("\b").append("\b").append("]");
        return str.toString();

    }


}
