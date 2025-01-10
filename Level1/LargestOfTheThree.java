import java.util.Scanner;

class LargestOfTheThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Takeing inputs of numbers
        System.out.print("Enter first number ");
        int numberFirst = input.nextInt();

        System.out.print("Enter second number ");
        int numberSecond = input.nextInt();

        System.out.print("Enter third number  ");
        int numberThird = input.nextInt();

        // result initialization
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        //  Finding largest number
        if (numberFirst > numberSecond && numberFirst > numberThird) {
            isFirstLargest = true;
        } else if (numberSecond > numberFirst && numberSecond > numberThird) {
            isSecondLargest = true;
        } else if (numberThird > numberFirst && numberThird > numberSecond) {
            isThirdLargest = true;
        }

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        
        input.close();
    }
}
