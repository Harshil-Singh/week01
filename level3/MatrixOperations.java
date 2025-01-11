import java.util.Random;

public class MatrixOperations {

    // Method to create a matrix with random values between 1 and 10
    public static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }
        return matrix; // Return the generated matrix
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result; // Return the resulting matrix after addition
    }

    // Method to subtract matrix b from matrix a
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result; // Return the resulting matrix after subtraction
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result; // Return the resulting matrix after multiplication
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose; // Return the transposed matrix
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to calculate the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse; // Return the inverse of the matrix
    }

    // Method to display a matrix of integers
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t"); // Print each element separated by tabs
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to display a matrix of doubles
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(String.format("%.2f", value) + "\t"); // Format each element to 2 decimal places
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = createMatrix(2, 2); // Create matrix A
        int[][] matrixB = createMatrix(2, 2); // Create matrix B

        System.out.println("Matrix A:");
        displayMatrix(matrixA); // Display matrix A
        System.out.println("Matrix B:");
        displayMatrix(matrixB); // Display matrix B

        System.out.println("Addition:");
        displayMatrix(addMatrices(matrixA, matrixB)); // Display the result of addition

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB)); // Display the result of subtraction

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA)); // Display the transpose of matrix A

        System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA)); // Display the determinant of matrix A

        System.out.println("Inverse of Matrix A:");
        displayMatrix(inverse2x2(matrixA)); // Display the inverse of matrix A
    }
}
