import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter values for a, b, and c
        System.out.print("Enter value for a (double): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b (double): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c (double): ");
        double c = scanner.nextDouble();

        // Performing the operations following the operator precedence
        double result1 = a + b * c;   
        double result2 = a * b + c;   
        double result3 = c + a / b;   
        double result4 = a % b + c;   

        // Display the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
		
		scanner.close();
    }
}
