import java.util.Scanner;

class SumUntilZero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// Initialize total with 0
        int total = 0; 
		// Variable to store input
        int number;  

        // Taking input and adding to the total until 0 is entered
        do {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            number = input.nextInt();
            total += number; 
        } while (number != 0);

        System.out.println("The total sum is: " + total);
        input.close();
    }
}
