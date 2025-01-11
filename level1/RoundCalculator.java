import java.util.Scanner;

class RoundCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Get the lengths of the sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Close the Scanner
        input.close();

        // Calculate the number of rounds to complete a 5 km run
        int rounds = calculateRoundsForRun(side1, side2, side3);

        // Display the result
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }

    // Method to calculate the number of rounds 
    private static int calculateRoundsForRun(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;  // Calculate the perimeter of the triangle
        return (int) Math.ceil(5000 / perimeter);  // Calculate rounds and round up if necessary
    }
}
