import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generate a number between 100000 and 999999
    }

    // Method to check if the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        // Use a HashSet to store unique OTP numbers
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            otpSet.add(otp); // Adding OTP to the set, duplicates will be ignored
        }
        // If the size of the set equals the length of the array, all OTPs are unique
        return otpSet.size() == otpArray.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];  // Array to store 10 OTP numbers
        
        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }
        
        // Check if all OTP numbers are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTP numbers are unique.");
        } else {
            System.out.println("\nSome OTP numbers are duplicates.");
        }
    }
}
