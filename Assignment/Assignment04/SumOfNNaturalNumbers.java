import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = sumOfNNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        scanner.close();
    }

    public static int sumOfNNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
