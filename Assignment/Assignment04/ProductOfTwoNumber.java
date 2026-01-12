import java.util.Scanner;

// [Define a method that returns the product of two numbers entered by user.
public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = product(num1, num2);
        System.out.println("Product: " + result);
        sc.close();
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
