import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players:");

        // Take input for the heights and calculate the sum
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Display the mean height
        System.out.println("\nMean height of the football team: " + mean);

        input.close();
    }
}
