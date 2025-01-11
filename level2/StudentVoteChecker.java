import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // If the age is negative, return false (invalid age)
            return false;
        } else if (age >= 18) {
            // If the age is 18 or greater, the student can vote
            return true;
        } else {
            // If the age is less than 18, the student cannot vote
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Create an array to store the age of 10 students
        int[] studentAges = new int[10];
        
        // Create an instance of StudentVoteChecker class
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Loop to get age input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
            
            // Check if the student can vote and display the result
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        
        input.close();
    }
}
