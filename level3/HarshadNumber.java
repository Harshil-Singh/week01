import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        int sum = 0;
        int originalNumber = number;

        // Loop to calculate the sum of digits
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number = number / 10;  // Remove the last digit from number
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        input.close();
    }
}
