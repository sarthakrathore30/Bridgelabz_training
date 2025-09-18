import java.util.Scanner;

public class SubstringDemo {

    public static String createSubstring(String str, int startIndex, int endIndex) {
        String sub = "";
        for (int i = startIndex; i < endIndex; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static boolean compareStrings(String str1, String str2) {
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

        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        String customSubstring = createSubstring(mainString, start, end);
        String builtinSubstring = mainString.substring(start, end);

        System.out.println("\nCustom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtinSubstring);

        System.out.println("\nAre the two substrings equal? " + compareStrings(customSubstring, builtinSubstring));

        scanner.close();
    }
}