import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        int count = 0;

        // Loop to count digits
        while (number != 0) {
            // Remove the last digit from the number
            number = number / 10;

            // Increase count by 1
            count++;
        }

        // Display the result
        System.out.println("The number of digits is: " + count);

        input.close();
    }
}
