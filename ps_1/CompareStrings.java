import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        // Compare strings lexicographically
        int result = string1.compareTo(string2);
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" lexicographically.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
