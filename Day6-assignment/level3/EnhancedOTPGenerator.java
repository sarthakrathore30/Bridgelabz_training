import java.util.Random;

public class EnhancedOTPGenerator {

    public static String generateSixDigitOTP() {
        Random random = new Random();
        String otp = "";

        for (int i = 0; i < 6; i++) {
            otp += random.nextInt(10);
        }
        return otp;
    }

    public static String[] generateMultipleOTPs(int count) {
        String[] otps = new String[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateSixDigitOTP();
        }
        return otps;
    }

    public static boolean areAllOTPsUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayOTPs(String[] otps) {
        System.out.println("Generated OTPs:");
        System.out.println("==============");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + String.format("%02d", i + 1) + ": " + otps[i]);
        }
    }

    public static void validateUniqueness(String[] otps) {
        boolean allUnique = areAllOTPsUnique(otps);
        System.out.println("\nValidation Result:");
        System.out.println("All OTPs are unique: " + allUnique);

        if (!allUnique) {
            System.out.println("Warning: Duplicate OTPs found!");

            System.out.println("\nDuplicate Analysis:");
            for (int i = 0; i < otps.length; i++) {
                for (int j = i + 1; j < otps.length; j++) {
                    if (otps[i].equals(otps[j])) {
                        System.out.println("OTP " + (i + 1) + " and OTP " + (j + 1) + " are identical: " + otps[i]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enhanced OTP Generator and Validator");
        System.out.println("===================================");

        String[] tenOTPs = generateMultipleOTPs(10);
        displayOTPs(tenOTPs);
        validateUniqueness(tenOTPs);

        System.out.println("\n" + "=".repeat(40));
        System.out.println("\nGenerating until all 10 OTPs are unique...");

        int attempts = 1;
        while (!areAllOTPsUnique(tenOTPs)) {
            tenOTPs = generateMultipleOTPs(10);
            attempts++;
        }

        System.out.println("Success! All unique OTPs generated after " + attempts + " attempt(s):");
        displayOTPs(tenOTPs);
        System.out.println("\nAll 10 OTPs are confirmed unique!");
    }
}