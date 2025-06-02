package Assignment.Assignment02;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to check wheter it is an armstrong number");
        int  n = input.nextInt();
        int original = n;
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if(sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
