import java.util.Scanner;

class CalculatingEmployeeBonus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the employee's salary ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee's years of service ");
        int yearsOfService = sc.nextInt();

        // Checking if the employee is eligible for the bonus
        if (yearsOfService > 5) {
            // Calculating bonus
            double bonus = salary * 5 / 100;
            System.out.println("Bonus amount is INR " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus");
        }

        input.close();
    }
}
