import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //taking base as input
        System.out.print("Enter the base of the triangle ");
        double base = input.nextDouble();

        // taking height as input
        System.out.print("Enter the height of the triangle ");
        double height = input.nextDouble();

        // Calculating the area of the triangle in square inches
        double areaInSquareInches = 0.5 * base * height;

        // Converting the area to square centimeters 
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        System.out.println("The area of the triangle In square inches is "+areaInSquareInches+" and area In square centimeters is "+areaInSquareCentimeters );
        
        input.close();
    }
}
