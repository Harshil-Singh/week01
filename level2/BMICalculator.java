import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height and weight for each person
            System.out.print("Height (in meters): ");
            height[i] = input.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weight[i] = input.nextDouble();

            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the weight status based on the BMI value
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nDetails for Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kilograms");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        input.close();
    }
}
