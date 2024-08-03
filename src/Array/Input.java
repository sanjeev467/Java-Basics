package Array;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Determine the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[n];

        // Use a for loop to take input for each element of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        };

        // Close the scanner
        scanner.close();
    }
}
