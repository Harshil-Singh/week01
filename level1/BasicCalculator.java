import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        System.out.println("The addition, subtraction, multiplication, and division values of numbers " 
            + number1 + " and " + number2 + " are " 
            + addition + ", " 
            + subtraction + ", " 
            + multiplication + ", and " 
            + division );
        
        input.close();
    }
}
