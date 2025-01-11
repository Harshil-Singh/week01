class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Example usage of the methods

        // Convert yards to feet
        double yards = 10;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        // Convert feet to yards
        double feetInput = 30;
        double yardsOutput = convertFeetToYards(feetInput);
        System.out.println(feetInput + " feet is equal to " + yardsOutput + " yards.");

        // Convert meters to inches
        double meters = 5;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        // Convert inches to meters
        double inchesInput = 50;
        double metersOutput = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput + " inches is equal to " + metersOutput + " meters.");

        // Convert inches to centimeters
        double inchesForCm = 10;
        double cmOutput = convertInchesToCm(inchesForCm);
        System.out.println(inchesForCm + " inches is equal to " + cmOutput + " centimeters.");
    }
}
