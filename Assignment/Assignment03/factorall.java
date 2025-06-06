package Assignment.Assignment03;

import java.util.Scanner;

public class factorall {
    // 23. Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number to find its factors ");
        int n=sc.nextInt();
        Factors(n);
        
    }
    static void Factors(int n){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(i+", ");
                }
            }
    }
}
