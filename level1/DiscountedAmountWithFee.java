import java.util.Scanner;
class DiscountedAmountWithFee {
	public static void main(String[] args) {
		
		// Creating Object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		
		// Taking user input for fee
		int fee = sc.nextInt();
		
		// Taking user input for discountPercent
		int discountPercent = sc.nextInt();
		
		// Calculate discount amount
	    int discountAmount = (fee*discountPercent)/100;
		
		// Calculate discount fee
		int discountedFee = fee - discountAmount;
		
		// Display result
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
		
		// Scanner class closed
		sc.close();
		
	}
}