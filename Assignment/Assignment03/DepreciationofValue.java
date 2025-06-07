package Assignment.Assignment03;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double initialValue = sc.nextDouble();
        System.out.print("Enter depreciation rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double depreciatedValue = initialValue;
        for (int i = 1; i <= years; i++) {
            depreciatedValue = depreciatedValue * (1 - rate / 100);
        }

        System.out.println("Depreciated value after " + years + " years: " + depreciatedValue);
    }
}
