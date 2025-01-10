import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays 
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for the age and height of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Initialize variables 
        int youngestAge = ages[0];
        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        
        System.out.println("\nYoungest Friend: ");
        if (youngestIndex == 0) {
            System.out.println("Amar, Age: " + youngestAge);
        } else if (youngestIndex == 1) {
            System.out.println("Akbar, Age: " + youngestAge);
        } else {
            System.out.println("Anthony, Age: " + youngestAge);
        }

        System.out.println("\nTallest Friend: ");
        if (tallestIndex == 0) {
            System.out.println("Amar, Height: " + tallestHeight);
        } else if (tallestIndex == 1) {
            System.out.println("Akbar, Height: " + tallestHeight);
        } else {
            System.out.println("Anthony, Height: " + tallestHeight);
        }

        input.close();
    }
}
