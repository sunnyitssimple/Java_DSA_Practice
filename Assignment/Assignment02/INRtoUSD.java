package Assignment.Assignment02;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter amount in rupeesto convert it into usd :");
        float n=input.nextFloat();
        System.out.println(USD(n));
        input.close();
    }
    static float USD(float rupee){
        float usd = (float) rupee / 80;
        return usd;
    }
}
