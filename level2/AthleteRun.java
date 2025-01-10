import java.util.Scanner;

public class AthleteRun {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double side1 = scanner.nextDouble();

		
        double side2 = scanner.nextDouble();

		
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Define the total distance to be run 
        double totalDistance = 5000;

        // Calculate the number of rounds required to complete 5 km
        double rounds = totalDistance / perimeter;

        // Output the result 
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        // Close the scanner object
        scanner.close();
    }
}
