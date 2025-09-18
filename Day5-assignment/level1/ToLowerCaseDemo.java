import java.util.Scanner;

public class ToLowerCaseDemo {

    public static String customToLowerCase(String str) {
        String lowerCaseStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseStr += (char)(ch + 32);
            } else {
                lowerCaseStr += ch;
            }
        }
        return lowerCaseStr;
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

        System.out.print("Enter text to convert to lowercase: ");
        String inputText = scanner.nextLine();

        String customResult = customToLowerCase(inputText);
        String builtinResult = inputText.toLowerCase();

        System.out.println("\nCustom lowercase result: " + customResult);
        System.out.println("Built-in lowercase result: " + builtinResult);

        System.out.println("\nAre the results equal? " + compareStrings(customResult, builtinResult));

        scanner.close();
    }
}