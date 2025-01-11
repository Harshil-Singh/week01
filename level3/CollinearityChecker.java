// Create CollinearityChecker class to verify collinearity
import java.util.Scanner;

class CollinearityChecker {

    // Check collinearity using slope formula
    public static boolean areCollinearUsingSlopes(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        return slopeAB == slopeBC;
    }

    // Check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three points
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check collinearity
        boolean isCollinearSlopes = areCollinearUsingSlopes(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear (Using Slopes): " + isCollinearSlopes);
        System.out.println("Collinear (Using Area): " + isCollinearArea);

        scanner.close();
    }
}
