import java.util.Scanner;

class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for input values
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        input.close();
    }
}
