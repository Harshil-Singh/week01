public class DiscountedFee{
	public static void main(String[] args){
		
	int fees=125000, discountPercent=10;
	
	//calculating discount amount
	int discount=(fees*10)/100;
	
	//calculating discountedFee
	int discountedFee=fees-discount;
	
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR  "+ discountedFee);
	
	}
	
}
