import java.util.Scanner;

class Tables{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Printing Table
 
        for (int currentMultiplier = 1; currentMultiplier <= 10; currentMultiplier++) {
            System.out.println(number + " x " + currentMultiplier + " = " + (number * currentMultiplier));
        }

        input.close();
    }
}
