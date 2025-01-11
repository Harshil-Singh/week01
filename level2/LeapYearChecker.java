import java.util.Scanner;

class LeapYearChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.close();

        // Check if the year is a leap year and display the result
        if (year >= 1582) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
    }

    // Method to check if the year is a Leap Year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
