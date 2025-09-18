import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to find shortest and longest words: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthArray = createWordLengthArray(words);
        int[] indices = findShortestLongest(wordLengthArray);

        System.out.println("\nShortest word: " + wordLengthArray[indices[0]][0] + " (Length: " + wordLengthArray[indices[0]][1] + ")");
        System.out.println("Longest word: " + wordLengthArray[indices[1]][0] + " (Length: " + wordLengthArray[indices[1]][1] + ")");

        scanner.close();
    }
}