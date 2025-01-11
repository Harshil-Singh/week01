import java.util.Scanner;

public class Quadratic {
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculating the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // If delta is zero, there is one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // If delta is negative, there are no real roots
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Take the coefficients of the quadratic equation from the user
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

        
        input.close();
    }
}
