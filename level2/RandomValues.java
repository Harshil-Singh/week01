import java.util.Scanner;

public class RandomValues {
    
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generates a 4-digit number
        }
        return randomNumbers;
    }

    // Method to find average, min, and max of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Generate an array of 5 4-digit random numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find the average, min, and max values of the random numbers
        double[] results = findAverageMinMax(randomNumbers);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Display the average, min, and max values
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);

        
        input.close();
    }
}
