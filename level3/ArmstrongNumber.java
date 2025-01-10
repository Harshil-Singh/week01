import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // 
        int sum = 0;  // To store the sum of cubes of digits
        int originalNumber = number;  
        int digit;

        // While loop 
        while (number != 0) {
            // Find the last digit using modulus operator
            digit = number % 10;

            // Cube the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit by dividing the number by 10
            number = number / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}
