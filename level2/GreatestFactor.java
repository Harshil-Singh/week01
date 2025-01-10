import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initializing greatestFactor variable
        int greatestFactor = 1;

        // Loop from number-1 down to 1 
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop as we found the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);

        input.close();
    }
}
