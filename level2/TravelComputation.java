import java.util.Scanner;

class TravelComputation {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Taking inputs for name, cities, and distances
      System.out.print("Enter name: ");
      String name = scanner.nextLine();
      
      System.out.print("Enter the starting city: ");
      String fromCity = scanner.nextLine();
      
      System.out.print("Enter the via city: ");
      String viaCity = scanner.nextLine();
      
      System.out.print("Enter the destination city: ");
      String toCity = scanner.nextLine();

      System.out.print("Enter distance from " + fromCity + " to " + viaCity + " : ");
      double distanceFromToVia = scanner.nextDouble();
      
      System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " : ");
      int timeFromToVia = scanner.nextInt();
      
      System.out.print("Enter distance from " + viaCity + " to " + toCity + " : ");
      double distanceViaToFinalCity = scanner.nextDouble();
      
      System.out.print("Enter time taken from " + viaCity + " to " + toCity + " : ");
      int timeViaToFinalCity = scanner.nextInt();

      // Calculate total distance and time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print travel details
      System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity + 
                         " via " + viaCity + " is " + totalDistance + " miles and the total time taken is " + 
                         totalTime + " minutes.");
   }
}
