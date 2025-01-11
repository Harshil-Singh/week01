import java.util.Scanner;

class TrigonometricFunctionsCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        input.close();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results for sine, cosine, and tangent
        System.out.println("Sine of the angle: " + results[0]);
        System.out.println("Cosine of the angle: " + results[1]);
        System.out.println("Tangent of the angle: " + results[2]);
    }

    // Method to calculate trigonometric functions: sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3]; // Array to store sine, cosine, and tangent

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        result[0] = Math.sin(radians); // Sine
        result[1] = Math.cos(radians); // Cosine
        result[2] = Math.tan(radians); // Tangent

        return result;
    }
}
