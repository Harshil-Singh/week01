import java.util.Scanner;

public class ChocolateDivision {
	.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        int numberOfChocolates = scanner.nextInt();
		
		
        int numberOfChildren = scanner.nextInt();

         Calculate the number of chocolates each child gets 
        int chocolatesPerChild = numberOfChocolates  numberOfChildren;
		
			Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

         Output the results
        System.out.println(The number of chocolates each child gets is  + chocolatesPerChild +  and the number of remaining chocolates are  + remainingChocolates);

        
        scanner.close();
    }
}