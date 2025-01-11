import java.util.Scanner;

public class NumberChecker {

    // Method to check whether a number is positive or negative
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public String isEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, or -1 if number1 < number2
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Create an instance of NumberChecker
        NumberChecker numberChecker = new NumberChecker();

        // Loop through the array and check if the number is positive or negative, and for positive numbers, check if it's even or odd
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (numberChecker.isPositive(number)) {
                // For positive numbers, check if it's even or odd
                System.out.println(number + " is positive and " + numberChecker.isEven(number) + ".");
            } else {
                // For negative numbers
                System.out.println(number + " is negative.");
            }
        }

        // Compare the first and last elements of the array and display if they are equal, greater, or less
        int result = numberChecker.compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        input.close();
    }
}
