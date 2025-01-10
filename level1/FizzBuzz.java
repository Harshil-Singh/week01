import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array to store the results
            String[] results = new String[number + 1];

            // Loop through the numbers and populate the array with Fizz, Buzz, or FizzBuzz
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i);
                }
            }

            // Loop through the array and print the results with index positions
            for (int i = 1; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }

        input.close();
    }
}
