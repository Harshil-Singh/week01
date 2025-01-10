import java.util.*;
class HeightConversion
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int heightInCm = input.nextInt();
		
		//convertiung height into foot
		double heightInFoot = heightInCm/30.48;
				
		//converting height into inches
		double inch = heightInCm / 2.54;
		
		
		
		System.out.println("Your height in cms is " + heightInCm + " while in feet is  " + heightInFoot + " and in inches is " + inch);
	}
}