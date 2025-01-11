import java.util.Scanner;

class NaturalNumberSumCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for the number n
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return; // Exit the program if the number is not a natural number
        }

        input.close();

        // Calculate the sum using recursion
        int recursiveSum = findSumRecursively(n);

        // Calculate the sum using the formula n*(n+1)/2
        int formulaSum = findSumUsingFormula(n);

        // Compare and print the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is an error in the calculations.");
        }
    }

    // Method to find the sum of n natural numbers using recursion
    public static int findSumRecursively(int n) {
        if (n == 1) {
            return 1; // Base case: sum of 1 is 1
        }
        return n + findSumRecursively(n - 1); // Recursive case: n + sum of n-1
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int findSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
