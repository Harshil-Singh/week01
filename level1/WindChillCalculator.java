import java.util.Scanner;

class WindChillCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        input.close();

        // Call the method to calculate the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }

    // Method to calculate the wind chill temperature using the formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
