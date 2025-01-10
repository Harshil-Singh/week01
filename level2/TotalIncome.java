import java.util.Scanner;

class TotalIncome {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int salary = input.nextInt();
		
		System.out.print("Enter bonus: ");
		int bonus  = input.nextInt();
		
		// Calculate income by adding salary and bonus
		int income = salary + bonus;
		
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
		
		
		input.close();
	}
}