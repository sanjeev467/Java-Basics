package TimeSpaceComplexity;

public class Constant {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        // add 10 to 1st element of array

        arr[0] = arr[0] +10; // Time C. --> O(1)
        System.out.println(arr[0]); // Time C. --> O(1)

        // O(1) + O(1) = O(2) == O(1) 2 is also a constant so, ultimately we can say that it is constant time comp
    }
}
