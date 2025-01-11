import java.util.Scanner;

class FactorCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        input.close();

        // Find the factors and store them in an array
        int[] factors = findFactors(number);

        // Find the sum, sum of squares, and product of the factors
        int sum = findSum(factors);
        int sumOfSquares = findSumOfSquares(factors);
        int product = findProduct(factors);

        // Display the results
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            if (factor != 0) {  // Only print non-zero factors
                System.out.print(factor + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        System.out.println("Product of factors: " + product);
    }

    // Method to find the factors of the number and save them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the sum of the squares of the factors
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to find the product of the factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
