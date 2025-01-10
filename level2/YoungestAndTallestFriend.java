import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the age of Amar: ");
        int amarAge = input.nextInt();
        System.out.print("Enter the height of Amar in cm: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter the height of Akbar in cm: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter the height of Anthony in cm: ");
        int anthonyHeight = input.nextInt();

        // Finding the youngest friend
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) 
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        if (anthonyAge < youngestAge) 
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";

        // Finding the tallest friend
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) 
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        if (anthonyHeight > tallestHeight) 
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";

        // Displaying the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        input.close();
    }
}
