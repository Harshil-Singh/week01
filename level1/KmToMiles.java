import java.util.*;

public class KmToMiles{
	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	
	double km=input.nextDouble();
	
	// Converting km to miles
	double distanceInMiles=km/1.6;
	
	System.out.println("The total miles is " + distanceInMiles + " mile for the given " + km + " km" );
	
	input.close();
	}
	
}
