import java.util.Scanner;

public class SubstringCounter {

    public static int countSubstringOccurrences(String mainStr, String subStr) {
        int count = 0;
        int startIndex = 0;

        while (startIndex <= mainStr.length() - subStr.length()) {
            boolean found = true;

            for (int i = 0; i < subStr.length(); i++) {
                if (mainStr.charAt(startIndex + i) != subStr.charAt(i)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                count++;
                startIndex += subStr.length();
            } else {
                startIndex++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        int count = countSubstringOccurrences(mainString, substring);

        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");

        scanner.close();
    }
}