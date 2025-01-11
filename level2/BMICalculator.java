import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; // weight in kg
            double heightInCm = personData[i][1]; // height in cm
            double heightInMeters = heightInCm / 100; // convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            personData[i][2] = bmi; // store BMI in the third column
        }
    }

    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2]; // get BMI from the array
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a 2D array for 10 persons, with 3 columns (weight, height, bmi)
        double[][] personData = new double[10][3];

        // Take user input for weight (kg) and height (cm)
        for (int i = 0; i < personData.length; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(personData);

        // Determine BMI status for all persons
        String[] status = determineBMIStatus(personData);

        // Display the results
        System.out.println("\nBMI and Status of Each Person:");
        for (int i = 0; i < personData.length; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        input.close();
    }
}
