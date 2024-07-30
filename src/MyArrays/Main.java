package MyArrays;

public class Main {
    public static void main(String[] args) {
        //Arrays are static

//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//
//        System.out.println(arr[4]); // this will give the element at index 4 which is 5


        //------------ArrayList----------------
        //-----------Dynamic Array--------------

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list);

        //------MyArray Class------------
        // To create My own Array--------


        MyArray arr = new MyArray(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);

//        System.out.println(arr);

        // indexOf function
//        System.out.println(arr.indexOf(2));

        // remove Element
//        arr.removeAt(2);

        // max element
//        System.out.println(arr.max());


        // Reverse thr Array

        arr.reverse();
        System.out.println(arr);


    }
}
