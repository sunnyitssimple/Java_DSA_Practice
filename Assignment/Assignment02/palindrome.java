package Assignment.Assignment02;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name to find whether its palindrome or not");
        String name = input.nextLine();
        String reversed = new StringBuilder(name).reverse().toString();
        if(name.equals(reversed)){
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }

    }
}
