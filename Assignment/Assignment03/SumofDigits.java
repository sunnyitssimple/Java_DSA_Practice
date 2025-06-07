package Assignment.Assignment03;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to findits sum of digits:");
        int n=sc.nextInt();
      System.out.println(sumofDigits(n));
    }
    static int sumofDigits(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
