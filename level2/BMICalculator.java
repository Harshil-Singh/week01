import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for weight in kg and height in cm
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Converting height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determining the weight status based on BMI
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else if (bmi >= 40.0) {
            status = "Obese";
        }

        // Displaying the result
        System.out.println("\nBMI: " + bmi);
        System.out.println("Weight Status: " + status);
  input.close();
    }
}