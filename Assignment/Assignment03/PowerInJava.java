package Assignment.Assignment03;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
