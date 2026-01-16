package Topics.BasicMaths;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            
            if ((num & 1)== 1) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");
            }
        }
    }
}