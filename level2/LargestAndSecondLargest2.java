import java.util.Scanner;

public class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the array size for storing digits and index
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits of the number and store in the array
        while (number != 0) {
            // Check if array size needs to be increased
            if (index == maxDigits) {
                maxDigits += 10;  // Increase array size by 10
                int[] temp = new int[maxDigits];  // Create a temporary larger array
                // Copy data from the old array to the new one
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;  // Assign the larger array to digits
            }
            
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Initialize variables for largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (largest == -1) {
            System.out.println("No digits found.");
        } else {
            System.out.println("Largest digit: " + largest);
            if (secondLargest == -1) {
                System.out.println("No second largest digit.");
            } else {
                System.out.println("Second largest digit: " + secondLargest);
            }
        }

        input.close();
    }
}
