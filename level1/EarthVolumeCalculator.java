import java.util.*;
class EarthVolumeCalculator {
	// Radius of Earth in kilometers
    private static final double EARTH_RADIUS_KM = 6378.0; 
	
	// Conversion factor from kilometers to miles
    private static final double KM_TO_MILES_CONVERSION_FACTOR = 0.621371; 

    public static void main(String[] args) {
		
        // Calculate the volume of Earth in cubic kilometers
        double volumeInKm3 = (4.0 / 3.0) * Math.PI * Math.pow(EARTH_RADIUS_KM, 3);

        // Convert radius to miles and calculate the volume in cubic miles
        double radiusInMiles = EARTH_RADIUS_KM * KM_TO_MILES_CONVERSION_FACTOR;
		
		// Calculate the volume of Earth in cubic kiloMiles
		double volumeInMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

        // Display the results
        System.out.printf("The volume of Earth in cubic kilometers is "  + volumeInKm3 + " and in cubic miles is " + volumeInMiles3);
    }
}
