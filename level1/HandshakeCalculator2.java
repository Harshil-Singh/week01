import java.util.Scanner;

class HandshakeCalculator2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Get the number of students
        int numberOfStudents = getNumberOfStudents(input);

        // Close the Scanner
        input.close();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        displayResult(numberOfStudents, maxHandshakes);
    }

    // Method to get the number of students from user input
    private static int getNumberOfStudents(Scanner input) {
        System.out.print("Enter the number of students: ");
        return input.nextInt();
    }

    // Method to calculate the maximum number of handshakes using combination formula
    private static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // Method to display the result
    private static void displayResult(int students, int handshakes) {
        System.out.println("The maximum number of handshakes among " + students + 
                           " students is " + handshakes);
    }
}
