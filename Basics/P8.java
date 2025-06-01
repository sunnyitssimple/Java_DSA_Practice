
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner num = new Scanner(System.in);
        int num1=num.nextInt();
        int num2=num.nextInt();
        num.close();
        System.out.println(num1+num2);

    }
}
