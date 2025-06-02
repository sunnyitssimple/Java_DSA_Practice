package Assignment.Assignment02;

import java.util.Scanner;

public class evenodd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find whether its even or odd: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Number is  even");
        }
        else{
            System.out.println("number is odd");
        }
        input.close();
    }
}
