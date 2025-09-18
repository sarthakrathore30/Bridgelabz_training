import java.util.Scanner;

public class StringTrimmer {

    public static int[] findTrimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String createSubstring(String str, int startIndex, int endIndex) {
        String result = "";
        for (int i = startIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
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

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        int[] trimPoints = findTrimPoints(input);
        String customTrimmed = createSubstring(input, trimPoints[0], trimPoints[1]);
        String builtinTrimmed = input.trim();

        System.out.println("\nOriginal string: '" + input + "'");
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtinTrimmed + "'");
        System.out.println("Are results equal? " + compareStrings(customTrimmed, builtinTrimmed));

        scanner.close();
    }
}