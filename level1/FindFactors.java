import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            input.close();
            return;
        }

        // Initialize variables for factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Expand array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
