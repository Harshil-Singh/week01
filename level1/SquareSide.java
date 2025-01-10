import java.util.*;

public class SquareSide{
	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	
	double parameter=input.nextDouble();
	
	// Calculating length
	double side=parameter/4;
	
	System.out.println("The length of the side is "+side+" whose perimeter is "+parameter);
	
	input.close();
	}
	
}
