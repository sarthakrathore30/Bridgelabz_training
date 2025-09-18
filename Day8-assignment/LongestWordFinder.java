import java.util.Scanner;

public class LongestWordFinder {

    public static String[] splitIntoWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            return new String[0];
        }

        int wordCount = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.isEmpty()) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.isEmpty()) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    public static String findLongestWord(String sentence) {
        String[] words = splitIntoWords(sentence);
        String longest = "";

        for (String word : words) {
            if (word != null && word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String longestWord = findLongestWord(input);

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());

        scanner.close();
    }
}