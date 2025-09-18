import java.util.Scanner;

public class SplitWordsDemo {

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < findStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < findStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordIndex] = currentWord;
                    wordIndex++;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to split into words: ");
        String input = scanner.nextLine();

        String[] customSplit = splitWords(input);
        String[] builtinSplit = input.split(" ");

        System.out.println("\nCustom split result:");
        for (String word : customSplit) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nBuilt-in split result:");
        for (String word : builtinSplit) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nAre the results equal? " + compareStringArrays(customSplit, builtinSplit));

        scanner.close();
    }
}