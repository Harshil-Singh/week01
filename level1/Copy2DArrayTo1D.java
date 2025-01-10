import java.util.Scanner;

public class Copy2DArrayTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Create the 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Take user input for the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.print("The 1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
