import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to input a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Ensure the year   
        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582, as the Gregorian calendar started in that year.");
        } else {
            // Checking leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                // Year is a leap year if it's divisible by 4 but not 100 or divisible by 400
                System.out.println(year + " is a Leap Year.");
            } else {
               
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}
