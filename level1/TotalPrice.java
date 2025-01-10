import java.util.*;
class TotalPrice
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
            System.out.print("Enter unit price");
		int unitPrice = input.nextInt();
		
		System.out.print("Enter quantity ");
		int quantity = input.nextInt();
			
		// total of Purchase
		int totalPurchase = unitPrice * quantity;
		
		
		System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity "+ quantity + " and unit price is INR " + unitPrice);
		
		input.close();
	}
}

