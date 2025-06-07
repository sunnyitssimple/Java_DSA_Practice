package Assignment.Assignment03;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of times interest applied per year: ");
        int n = sc.nextInt();
        System.out.print("Enter number of years: ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + (rate / 100) / n), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);
    }
}
