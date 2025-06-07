package Assignment.Assignment03;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Invalid input. n should be >= r and both should be non-negative.");
            return;
        }

        long ncr = factorial(n) / (factorial(r) * factorial(n - r));
        long npr = factorial(n) / factorial(n - r);

        System.out.println("nCr (Combination): " + ncr);
        System.out.println("nPr (Permutation): " + npr);
    }

    static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
