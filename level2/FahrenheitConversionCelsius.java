import java.util.Scanner;

public class FahrenheitConversionCelsius {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Enter temperature 
        double fahrenheitTemperatur = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusConversion = (fahrenheitTemperatur - 32) * 5 / 9;

       
        System.out.println("The " + fahrenheitTemperatur +" fahrenheit is "+ celsiusConversion +" celsius.");

        scanner.close();
    }
}
