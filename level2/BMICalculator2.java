import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // 3 columns: [0] = height, [1] = weight, [2] = BMI
        String[] weightStatus = new String[numberOfPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height and weight for each person, ensure positive values
            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Weight (in kilograms): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the personData array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // print the height, weight, BMI, and weight status of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nDetails for Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kilograms");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
