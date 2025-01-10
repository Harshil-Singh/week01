public class AveragePercentInPCM{
	public static void main(String[] args){
	
	String name="Sam";
	
	double maths=94,physics=95,chemistry=96;
	
	// Calculate the total marks in PCM
	double totalMarks=maths+physics+chemistry;
	
	// Calculate the percentage (total marks divided by maximum possible marks)
	double percentage=totalMarks*100/300;
	
	System.out.println(name+"'s average mark in PCM is "+percentage);
	}
	
}
