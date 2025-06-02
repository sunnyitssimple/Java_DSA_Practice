package Assignment.Assignment02;

import java.util.Scanner;

public class calculatorifelse {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("enter the operator:");
        char operator = input.nextLine().charAt(0);
        // Example usage to avoid "variable is never read" warning
        System.out.println("You entered operator: " + operator);
        System.out.println("enter the first number:");
        int num1 = input.nextInt();
        System.out.println("enter the second number:");
        int num2 = input.nextInt();
        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        // else if and further logic can be added here for other operators
        else if(operator=='-'){
            System.out.println(num1-num2);
        }
        else if(operator=='*'){
            System.out.println(num1*num2);
        }
        else if (operator=='/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("invalid operator");
        }
    }
}
