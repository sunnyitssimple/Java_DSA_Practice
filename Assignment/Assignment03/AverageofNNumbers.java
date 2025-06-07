package Assignment.Assignment03;

import java.util.Scanner;

public class AverageofNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers (N): ");
        int n = sc.nextInt();
        double sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        double average = sum / n;
        System.out.println("Average of " + n + " numbers is: " + average);
    }
}
