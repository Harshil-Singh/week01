import java.util.*;

public class SwappingNumbers{
	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the first number: ");//input number 1
    int number1 = input.nextInt();
        
    System.out.print("Enter the second number: ");//input number 2
    int number2 = input.nextInt();
	
	//swapping the numbers
	int temp=number1;
	number1=number2;
	number2=temp;
	
	System.out.println("The swapped numbers are  "+number1+" and "+ number2);
	
	input.close();
	}
	
}
