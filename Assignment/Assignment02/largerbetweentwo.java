package Assignment.Assignment02;

import java.util.Scanner;

public class largerbetweentwo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = input.nextInt();
         System.out.print("enter the second number:");
         int b = input.nextInt();
         if(a>b){
            System.out.println("First number is greater than second number!");
         }
         else{
            System.out.println("Second number is greater than the first number ");
         }
         input.close();
    }
}
