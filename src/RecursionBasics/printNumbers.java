package RecursionBasics;

public class printNumbers {
    public static void numberPrint(int num){
        if(num<1) return ;

        // print the current Number
        System.out.println(num + " ");

        // recursive call with next lower number
        numberPrint(num - 1);

    }

    public static void main(String[] args) {
        int num = 5;
        numberPrint(num);
    }
}
