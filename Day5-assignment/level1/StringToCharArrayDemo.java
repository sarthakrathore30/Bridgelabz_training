import java.util.Scanner;
import java.util.Arrays;

public class StringToCharArrayDemo {

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        char[] userDefinedArray = getChars(inputString);
        char[] builtinArray = inputString.toCharArray();

        System.out.println("\nUser-defined char array: " + Arrays.toString(userDefinedArray));
        System.out.println("Built-in toCharArray(): " + Arrays.toString(builtinArray));

        System.out.println("\nAre the arrays equal? " + compareCharArrays(userDefinedArray, builtinArray));

        scanner.close();
    }
}