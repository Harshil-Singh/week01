import java.util.Scanner;

public class FirstSmallestOfThree{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking first number as input
        System.out.print("Enter the first number: ");
        int numberFirst = input.nextInt();

		// Taking first number as input
        System.out.print("Enter the second number: ");
        int numberSecond = input.nextInt();
		// Taking first number as input
        System.out.print("Enter the third number: ");
        int numberThird = input.nextInt();
		
		boolean isTheFirstSmallest;

        // Check if the first number is the smallest
        if (numberFirst < numberSecond && numberFirst < numberThird) {
            isTheFirstSmallest = true;
        } else {
            isTheFirstSmallest = false;
        }

		System.out.println("Is the first number the smallest? " + isTheFirstSmallest);
        input.close();
    }
}
