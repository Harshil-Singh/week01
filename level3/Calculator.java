import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input values for the calculator
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        double result;

        // Switch-case to perform the operation based on the operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        input.close();
    }
}
