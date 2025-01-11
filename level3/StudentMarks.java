import java.util.Random;

public class StudentMarks {

    // Method to generate random scores for students in three subjects
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3]; // Array to store scores for 3 subjects
        for (int i = 0; i < students; i++) {
            // Generate random scores between 60 and 100 for each subject
            scores[i][0] = random.nextInt(41) + 60; // Physics
            scores[i][1] = random.nextInt(41) + 60; // Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Math
        }
        return scores; // Return the array of student scores
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // [Total, Average, Percentage]
        for (int i = 0; i < students; i++) {
            // Calculate total of the scores
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculate average and round to two decimal places
            double average = Math.round((double) total / 3 * 100.0) / 100.0;
            // Calculate percentage (rounded to the nearest whole number)
            double percentage = Math.round((double) total / 3.0);
            // Store results for each student
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results; // Return the array of calculated results
    }

    // Method to display the scorecard for all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            // Display each student's scores, total, average, and percentage
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\n");
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // Set the number of students
        // Generate random scores for each student
        int[][] scores = generateScores(numberOfStudents);
        // Calculate the results (total, average, percentage) for each student
        double[][] results = calculateResults(scores);
        // Display the scorecard with all the details
        displayScorecard(scores, results);
    }
}
