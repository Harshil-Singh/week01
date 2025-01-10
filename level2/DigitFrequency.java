import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store digits of the number
        int[] digits = new int[count];
        temp = number;

        // Store the digits in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create a frequency array of size 10 to store the frequency of each digit
        int[] frequency = new int[10];

        // Find the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
