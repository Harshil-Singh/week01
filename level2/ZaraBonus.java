import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays 
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total calculations
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            // Take salary input
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            while (true) {
                salary[i] = input.nextDouble();
                if (salary[i] > 0) {
                    break; // Valid salary input
                } else {
                    System.out.print("Invalid salary. Please enter a positive number: ");
                }
            }

            // Take years of service input
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            while (true) {
                yearsOfService[i] = input.nextInt();
                if (yearsOfService[i] >= 0) {
                    break; // Valid years of service input
                } else {
                    System.out.print("Invalid years of service. Please enter a non-negative number: ");
                }
            }
        }

        // Loop to calculate bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for employees with more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for employees with 5 years or less
            }

            newSalary[i] = salary[i] + bonus[i]; // New salary after adding bonus

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print total calculations
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary (after bonus): " + totalNewSalary);

        input.close();
    }
}
