package BasicMaths;

// count no of primes numbers

public class countPrime {

    public static boolean isPrime(int n){
        for(int i = 2; i<=n/2; i++){  //
            if(n%i==0) return false;
        }
        return true;
    }

    public static int countPrimeNo(int n){
        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimeNo(10));

    }
}
// this will code show time limit exceeded
// no a better solution