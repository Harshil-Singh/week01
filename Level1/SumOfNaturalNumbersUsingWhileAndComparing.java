import java.util.Scanner;

class SumOfNaturalNumbersUsingWhileAndComparing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number ");
        int number = input.nextInt();

        // Check if the input is a  natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Computing the sum using  a while loop
            int sumUsingWhile = 0;
            int i = 1;
            while (i <= number) {
                sumUsingWhile += i;
                i++;
            }

            // Calculating the sum using the formula
            int sumFromFormula = number * (number + 1) / 2;

            // Display the results
            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumFromFormula);

            // Comparing the  results
            if (sumUsingWhile == sumFromFormula) {
                System.out.println("Both computations are correct and produce the same result");
            } else {
                System.out.println("Results are different");
            }
        }

        input.close();
    }
}
