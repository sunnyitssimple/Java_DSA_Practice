
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter your name ");
        String naam=sc.next();
        String Personalized = Greet(naam);
       System.out.println( Personalized);
    }
    static String Greet(String name){
        String greet="hello "+name;
        return greet;
    }
}
