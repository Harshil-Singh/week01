import java.util.Scanner;

public class FriendFinder {

    // Method to find the youngest friend based on age
    public int findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend based on height
    public int findTallest(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for age and height of 3 friends
        System.out.print("Enter the age of Amar: ");
        ages[0] = input.nextInt();
        System.out.print("Enter the height of Amar: ");
        heights[0] = input.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        ages[1] = input.nextInt();
        System.out.print("Enter the height of Akbar: ");
        heights[1] = input.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        ages[2] = input.nextInt();
        System.out.print("Enter the height of Anthony: ");
        heights[2] = input.nextDouble();

        // Create an instance of FriendFinder
        FriendFinder friendFinder = new FriendFinder();

        // Find the youngest and the tallest friends
        int youngestIndex = friendFinder.findYoungest(ages);
        int tallestIndex = friendFinder.findTallest(heights);

        // Display the results
        System.out.println("The youngest friend is " + (youngestIndex == 0 ? "Amar" : (youngestIndex == 1 ? "Akbar" : "Anthony")) + ".");
        System.out.println("The tallest friend is " + (tallestIndex == 0 ? "Amar" : (tallestIndex == 1 ? "Akbar" : "Anthony")) + ".");

        input.close();
    }
}
