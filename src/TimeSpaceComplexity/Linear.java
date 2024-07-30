package TimeSpaceComplexity;

public class Linear {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //print elements of array
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // copy elements of arr to another array

        int[] newArr = new int[arr.length]; // T.C = O(1), S.P = O(n)

        for(int i= 0; i<arr.length; i++){// T.C = O(n), S.P = O(1)
            newArr[i] =arr[i];

        }

        for(int num:newArr){ // // T.C = O(n), S.P = O(1)
            System.out.println(num);
        }
    }
}
