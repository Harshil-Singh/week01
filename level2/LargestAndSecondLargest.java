import java.util.Scanner;

public class LargestAndSecondLargest {
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
            digits[index] = number % 10;
            number = number / 10;
            index++;
            if (index == maxDigits) {
                break;  
            }
        }

      
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
