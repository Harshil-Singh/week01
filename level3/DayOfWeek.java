public class DayOfWeek {
    public static void main(String[] args) {
        // Get the month, day, and year from command-line arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Step 1: Calculate y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Calculate d0
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result (0 = Sunday, 1 = Monday, 2 = Tuesday, etc.)
        System.out.println(d0);
    }
}
