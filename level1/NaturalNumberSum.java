import java.util.Scanner;

class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Get integer input from the user
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        
        input.close();

        // Calculate the sum of the first n natural numbers
        int sum = calculateSumOfNaturalNumbers(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    // Method to find the sum of the first n natural numbers using a loop
    private static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add the current number to the sum
        }
        return sum;
    }
}
