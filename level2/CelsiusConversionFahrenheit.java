import java.util.Scanner;

public class CelsiusConversionFahrenheit {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Enter temperature 
        double celsiusTemperatur = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitTemperatur = (celsiusTemperatur * 9 / 5) + 32;

        // Output the result
        System.out.println("The " + celsiusTemperatur + " Celsius is " + fahrenheitTemperatur + " Fahrenheit.");

      
        scanner.close();
    }
}
