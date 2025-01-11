import java.util.Scanner;

class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the numbers
        System.out.print("Enter the numerator: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        input.close();

        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    // Method to find the remainder and the quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];  // Array to store quotient and remainder

        // Find the quotient and remainder
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder

        return result;
    }
}
