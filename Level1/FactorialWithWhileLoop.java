import java.util.Scanner;

class FactorialWithWhileLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculating factorial using a while loop
            int factorial = 1;
            int multiplier = 1;

            while (multiplier <= number) {
                factorial *= multiplier;
                multiplier++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
