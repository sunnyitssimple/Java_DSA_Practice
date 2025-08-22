import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('s'+3));
        System.out.println("a"+1);
        System.out.println("Sunny"+new ArrayList<>());
        // System.out.println("Sunny"+new Integer(56));
        // System.out.println(new Integer(56)+new ArrayList<>()); ---->Error because plus operator can be only used with the primitives or atleast one of the object should be of type String //// like below
        System.out.println(new Integer(56)+" "+new ArrayList<>());
    }
}
