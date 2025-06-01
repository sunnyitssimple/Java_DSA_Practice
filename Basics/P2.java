
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of rupee required");
        Scanner Amount =new Scanner(System.in);
        int Value=Amount.nextInt();
        System.out.println("The value for money  is "+Value);
        Amount.close();
    }
}
