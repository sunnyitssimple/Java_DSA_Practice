package Assignment.Assignment03;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();
        System.out.print("Enter commission percentage: ");
        double commissionPercent = sc.nextDouble();

        double commission = (commissionPercent / 100) * sales;

        System.out.println("Commission amount: " + commission);
    }
}
