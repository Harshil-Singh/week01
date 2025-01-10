import java.util.Scanner;

class RocketCountDown{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input of start of count down
        System.out.print("Enter the starting value for countdown ");
        int counter = input.nextInt();

        // Countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        input.close();
    }
}
