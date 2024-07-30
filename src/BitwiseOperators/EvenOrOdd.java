package BitwiseOperators;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // to find no is even or add using bitwise AND operator

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No: ");

        int number = scanner.nextInt();
        if((number & 1) == 0){
            // for eg if we do 10 & 1
            // the system will convert the 10 into its binary form which is 1010 and then perform AND operation
            // 1010 & 1 --> 0
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }



    }
}
