import java.util.Scanner;

class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        input.close();

        // Call the method to find the number of chocolates each child gets and the remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child will get: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient (chocolates per child) and remainder (remaining chocolates)

        // Calculate chocolates each child gets (quotient)
        result[0] = number / divisor;

        // Calculate remaining chocolates (remainder)
        result[1] = number % divisor;

        return result;
    }
}
