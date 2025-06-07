package Assignment.Assignment03;

import java.util.Scanner;

public class DiscountofProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * price;
        double finalPrice = price - discountAmount;

        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Price after discount: " + finalPrice);
    }
}
