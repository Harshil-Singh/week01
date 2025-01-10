import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        int sum = 0;

        // Loop to find divisors of the number and add them to the sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}
