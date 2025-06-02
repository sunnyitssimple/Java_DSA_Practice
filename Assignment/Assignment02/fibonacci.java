package Assignment.Assignment02;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        System.out.print("enter the number of fibonacci number you want:");
        int n = input.nextInt();
        printFibonacci(n);
    }
    static void printFibonacci(int n){
        int a = 0, b = 1;
        System.out.println(a);
        if (n > 1) System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
