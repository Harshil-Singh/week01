import java.util.Scanner;

class NumberDivisibleBYFive {
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//taking number as input
        System.out.print("Enter a number - ");
		
		int number = input.nextInt();
		
		boolean divisibleByFive;
		
        // Check if the number is divisible by 5.
        if (number % 5 == 0) {
            divisibleByFive = true;
        } else {
            divisibleByFive = false;
        }
		
		System.out.println("Is the number " + number + " divisible by 5? " + divisibleByFive);
		input.close();
    }
}
