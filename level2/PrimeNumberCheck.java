import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Assume the number 
        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop to check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop as it's not prime
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        input.close();
    }
}
