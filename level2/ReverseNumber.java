import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store digits of the number
        int[] digits = new int[count];

        // Store the digits in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
