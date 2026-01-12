import java.util.ArrayList;
import java.util.List;

public class PrimeNumberBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println(primeBetween(23, 345));
    }

    public static List<Integer> primeBetween(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
