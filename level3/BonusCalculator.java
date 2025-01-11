// Create BonusCalculator class to compute bonuses
class BonusCalculator {

    // Generate random salaries and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = (int) (Math.random() * 90000) + 10000; // Salary
            employeeData[i][1] = (int) (Math.random() * 15) + 1; // Years of service
        }
        return employeeData;
    }

    // Calculate new salaries and bonuses
    public static int[][] calculateBonus(int[][] employeeData) {
        int[][] newSalaries = new int[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            int bonus = (int) (salary * bonusRate);
            newSalaries[i][0] = salary + bonus;
            newSalaries[i][1] = bonus;
        }
        return newSalaries;
    }

    // Display salary details in tabular format
    public static void displaySalaries(int[][] employeeData, int[][] newSalaries) {
        int oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Old Salary", "Years", "New Salary", "Bonus");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            int newSalary = newSalaries[i][0];
            int bonus = newSalaries[i][1];
            oldSalarySum += oldSalary;
            newSalarySum += newSalary;
            totalBonus += bonus;
            System.out.printf("%-10d %-10d %-10d %-10d\n", oldSalary, years, newSalary, bonus);
        }
        System.out.printf("\nTotal Old Salary: %d\nTotal New Salary: %d\nTotal Bonus: %d\n", oldSalarySum, newSalarySum, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonuses and new salaries
        int[][] newSalaries = calculateBonus(employeeData);

        // Display results
        displaySalaries(employeeData, newSalaries);
    }
}
