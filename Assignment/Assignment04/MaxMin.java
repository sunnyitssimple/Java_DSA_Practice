import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter The First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();
       
        if (a > b && a > c) {
            System.out.println("a is the greatest number");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest");
        } else {
            System.out.println("c is the greatest");
        }
    }
    }

}