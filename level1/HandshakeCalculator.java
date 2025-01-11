import java.util.Scanner;

class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Close the Scanner
        input.close();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is " + maxHandshakes);
    }

    // Method to calculate the maximum number of handshakes using combination formula
    private static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
