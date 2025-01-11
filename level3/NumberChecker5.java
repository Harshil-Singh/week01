public class NumberChecker5 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop to store the factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1]; // Last element is the greatest factor
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = sumOfFactors(number) - number; // Exclude the number itself
        return sumOfDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = sumOfFactors(number) - number; // Exclude the number itself
        return sumOfDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sumOfDivisors = sumOfFactors(number) - number; // Exclude the number itself
        return sumOfDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit); // Add factorial of each digit
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 145;  // You can change this number for testing

        // Find and display the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));

        // Find the sum of the factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));

        // Find the product of the factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));

        // Find the product of the cubes of the factors
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubeOfFactors(number));

        // Check if the number is a perfect number
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));

        // Check if the number is an abundant number
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));

        // Check if the number is a deficient number
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}
