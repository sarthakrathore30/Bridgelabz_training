import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            if (i <= sentence.length() - oldWord.length()) {
                boolean found = true;

                for (int j = 0; j < oldWord.length(); j++) {
                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        found = false;
                        break;
                    }
                }

                if (found && (i == 0 || !Character.isLetter(sentence.charAt(i - 1))) &&
                    (i + oldWord.length() == sentence.length() || 
                     !Character.isLetter(sentence.charAt(i + oldWord.length())))) {
                    result += newWord;
                    i += oldWord.length();
                } else {
                    result += sentence.charAt(i);
                    i++;
                }
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter replacement word: ");
        String newWord = scanner.next();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Original: " + sentence);
        System.out.println("Modified: " + result);

        scanner.close();
    }
}