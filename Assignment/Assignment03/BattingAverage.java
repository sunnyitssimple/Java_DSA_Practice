package Assignment.Assignment03;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of times out: ");
        int outs = sc.nextInt();

        if (outs == 0) {
            System.out.println("Batting average is undefined (never out).");
        } else {
            double average = (double) runs / outs;
            System.out.println("Batting average: " + average);
        }
    }
}
