
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        System.out.println(Sum());
    }
    static int Sum(){
        System.out.println("enter the first number");
        Scanner input =new Scanner(System.in);
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is ");
        return sum;
    }
}
