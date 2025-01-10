import java.util.Scanner;

class SumOfNatural{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// input number t 
		System.out.print("Enter number ");
		int number = input.nextInt();
		
        // Checking if the number is a natural number
        if (number > 0) {
		
            // Calculating the sum of first n natural number
            int sumOfNaturalNumbers = number * (number + 1) / 2;
            System.out.println("The sum of the first " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number is not a natural number");
        }
		
		input.close();
    }
}
