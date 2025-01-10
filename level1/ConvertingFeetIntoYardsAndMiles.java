import java.util.Scanner;

class ConvertingFeetIntoYardsAndMiles {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // take distance as input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // conversion ratio
        final double FEET_TO_YARDS = 1.0 / 3.0; 
        final double YARDS_TO_MILES = 1.0 / 1760.0; 

        // Convert the distance
        double distanceInYards = distanceInFeet * FEET_TO_YARDS;
        double distanceInMiles = distanceInYards * YARDS_TO_MILES;

        // Display the results
        System.out.printf("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		
		scanner.close();
    }
}
