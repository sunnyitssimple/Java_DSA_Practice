package Topics.BasicMaths;

public class SquareRootNR {
    public static double sqrt(double n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        if (n == 0) return 0;

        double epsilon = 1e-10; // Desired precision
        double x = n;           // Initial guess (n is a common starting point)
        double root;

        while (true) {
            // Newton-Raphson step: x_next = 0.5 * (x + n / x)
            root = 0.5 * (x + (n / x));

            // Check if the difference is within tolerance
            if (Math.abs(root - x) < epsilon) {
                break;
            }
            x = root;
        }
        return root;
    }

    public static void main(String[] args) {
        double number = 20.0;
        System.out.println("Square root of " + number + " is: " + sqrt(number));
        // Verification with built-in method
        System.out.println("Built-in Math.sqrt: " + Math.sqrt(number));
    }
}
