import java.util.Scanner;

public class ToUpperCaseDemo {

    public static String customToUpperCase(String str) {
        String upperCaseStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseStr += (char)(ch - 32);
            } else {
                upperCaseStr += ch;
            }
        }
        return upperCaseStr;
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

        System.out.print("Enter text to convert to uppercase: ");
        String inputText = scanner.nextLine();

        String customResult = customToUpperCase(inputText);
        String builtinResult = inputText.toUpperCase();

        System.out.println("\nCustom uppercase result: " + customResult);
        System.out.println("Built-in uppercase result: " + builtinResult);

        System.out.println("\nAre the results equal? " + compareStrings(customResult, builtinResult));

        scanner.close();
    }
}