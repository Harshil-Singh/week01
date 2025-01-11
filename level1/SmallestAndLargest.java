import java.util.Scanner;

class SmallestAndLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Get input for three numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        
        input.close();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store the smallest and largest

        // Find the smallest number
        result[0] = Math.min(number1, Math.min(number2, number3));

        // Find the largest number
        result[1] = Math.max(number1, Math.max(number2, number3));

        return result;
    }
}
