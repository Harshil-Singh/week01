import java.util.Arrays;

public class NumberChecker2 {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Using Math.pow() to square the digits
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sum = sumOfDigits(digits);
        return originalNumber % sum == 0; // A number is Harshad if divisible by sum of digits
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 2D array with 10 rows (one for each digit from 0 to 9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column stores the digit (0 to 9)
            frequency[i][1] = 0; // Initialize frequency count to 0
        }
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        // Filter out digits with zero frequency and return only those with frequency > 0
        return Arrays.stream(frequency)
                     .filter(row -> row[1] > 0)
                     .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        // Sample number to work with
        int number = 21;
        
        // Store the digits of the number
        int[] digits = storeDigits(number);
        
        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Find and display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        
        // Find and display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        
        // Check if it's a Harshad number
        if (isHarshadNumber(digits, number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
        
        // Find and display the frequency of digits
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency: ");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + ": " + freq[1] + " time(s)");
        }
    }
}
