import java.util.*;
class MaximumHandshakes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int numberOfPeople = input.nextInt();
			
		// total number of handshakes		
		int totalHandshake= (numberOfPeople * (numberOfPeople - 1) ) / 2;
		
		
		System.out.println("The total number of possible handshakes is " + totalHandshake);
		
		input.close();
	}
}
