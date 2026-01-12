import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circumferenceofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circumference = getCircumference(radius);
        double area = getArea(radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        sc.close();
    }

    public static double getCircumference(double r) {
        return 2 * Math.PI * r;
    }

    public static double getArea(double r) {
        return Math.PI * r * r;
    }
}
