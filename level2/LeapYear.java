import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is >= 1582
        if (year < 1582) {
            System.out.println("Please enter a year");
        } else {
            //  Using multiple if-else statements for leap year check
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Using a single if statement with logical operators
            if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}
