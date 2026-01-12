import java.util.Scanner;

//  9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) * n.
// E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// 1! = 1 
// 0! = 1


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println(n + "! = " + Factorial(n));
        }
        sc.close();
    }

    public static long Factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
