import java.util.Scanner;

class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object named input

        // Taking input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Close the Scanner
        input.close();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal + ", Rate of Interest " + rate +
                ", and Time " + time);
    }

    // Method to calculate simple interest using the formula
    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
