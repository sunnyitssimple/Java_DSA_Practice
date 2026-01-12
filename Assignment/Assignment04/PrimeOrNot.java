import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int userInput = scanner.nextInt();
        if (isPrime(userInput)) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is not a prime number.");
        }
        scanner.close();
    }
}
