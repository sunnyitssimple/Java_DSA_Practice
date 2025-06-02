package Assignment.Assignment02;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        int P=input.nextInt();
        System.out.println("enter rate ");
        int R=input.nextInt();
        System.out.println("enter the timme period");
        int T=input.nextInt();
        SI(P,R,T);
        input.close();
    }
    static void SI(int P,int R,int T){
        int si=(P*R*T)/100;
        System.out.println("the  simple interest is:");
        System.out.println(si);
    }
}
