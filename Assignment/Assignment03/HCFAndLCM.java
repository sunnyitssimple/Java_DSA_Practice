package Assignment.Assignment03;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = findHCF(a, b);
        int lcm = (a * b) / hcf;

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}