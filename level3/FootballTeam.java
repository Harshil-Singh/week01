import java.util.Random;

public class FootballTeam {

    // Method to generate random heights for the football team
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        
        // Generate random height values between 150 cm and 250 cm
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Random number between 150 and 250
        }
        
        return heights;
    }

    // Method to find the sum of all the elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an array of 11 players and generate random heights
        int[] heights = generateRandomHeights(11);

        // Find the sum, mean, shortest, and tallest height
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Heights of the football players (in cms):");
        for (int height : heights) {
            System.out.println(height);
        }

        System.out.println("\nSum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
