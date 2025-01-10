public class DividingPens{
	public static void main(String[] args){
		
	int totalPens=14, totalstudents=3;
	
	//calculating pens per student
	int pensPerStudent=totalPens/totalstudents;
	
	//calculating pens remaining
	int pensRemaining=totalPens%totalstudents;
	
	System.out.println("The Pen Per Student is "+pensPerStudent+" and the remaining pen not distributed is "+ pensRemaining);
	
	}
	
}
