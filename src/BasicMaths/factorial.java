package BasicMaths;

public class factorial {
    static long Number(int n){
        long fact = 1;
        for (int i = 1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial.Number(4));
    }
}