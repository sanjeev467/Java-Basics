package NumberSystem;

import java.util.Scanner;

public class DecimalTOBinary {
    public static void main(String[] args) {

        // To convert decimal to binary

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal No: ");
        String result = "";

        int number = scanner.nextInt();
        while(number>0){
            int remainder = number%2; // taking out the remainder by using % operator
            number = number/2; // dividing the no by 2
            result = remainder + result;

        }

        System.out.println(result);


    }
}
