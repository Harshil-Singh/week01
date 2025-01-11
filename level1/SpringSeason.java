class SpringSeason {

    public static void main(String[] args) {
        // Get month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls within the Spring season
        boolean isSpringSeason = checkSpringSeason(month, day);

        // Display the result based on the check
        if (isSpringSeason) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if the given month and day fall within the Spring season
    private static boolean checkSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month > 3 && month < 6) {
            return true;  
        } else if (month == 3 && day >= 20) {
            return true;  
        } else if (month == 6 && day <= 20) {
            return true; 
        }
        return false;  // Not in the Spring season
    }
}
