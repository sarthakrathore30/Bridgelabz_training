import java.util.Scanner;

public class CompareStrings {

    public static boolean compareWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.next();

        System.out.print("Enter the second string: ");
        String secondString = scanner.next();

        System.out.println("\nComparing using custom charAt() method: " + compareWithCharAt(firstString, secondString));
        System.out.println("Comparing using built-in equals() method: " + firstString.equals(secondString));

        scanner.close();
    }
}