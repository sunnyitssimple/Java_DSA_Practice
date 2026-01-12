import java.util.Scanner;

public class PythagoreanTripletOrNot {
    // Function to check if a, b, c form a Pythagorean triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;
        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }
        return x * x == y * y + z * z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println(a + ", " + b + ", " + c + " do not form a Pythagorean triplet.");
        }
        sc.close();
    }
}
