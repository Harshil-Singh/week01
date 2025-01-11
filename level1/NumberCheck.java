import java.util.Scanner;

class NumberCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Get integer input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Close the Scanner
        input.close();

        // Check the number and get the result
        int result = checkNumber(number);

        // Display the result
        System.out.println("The number is: " + result);
    }

    // Method to check whether the number is positive, negative, or zero
    private static int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }
}
