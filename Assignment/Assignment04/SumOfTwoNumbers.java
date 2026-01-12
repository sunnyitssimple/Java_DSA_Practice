import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        scanner.close();
        }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
