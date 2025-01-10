import java.util.Scanner;

class SumUntilZeroOrNegative{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0; //  total Initialization

        // Taking input from user and adding until 0 or  a negative number is entered
        while (true) {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            int number = input.nextInt();
            if (number <= 0) {
                break; // Exit the loop if input is 0 or a nagetive number 
            }
            total += number; // Add input to total
        }

        System.out.println("The total sum is: " + total);
        input.close();
    }
}
