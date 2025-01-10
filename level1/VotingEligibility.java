import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Get age input for all students
        System.out.println("Enter the ages of 10 students");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote");
            } else {
                System.out.println("The student with the age " + age + " cannot vote");
            }
        }

        
        input.close();
    }
}
