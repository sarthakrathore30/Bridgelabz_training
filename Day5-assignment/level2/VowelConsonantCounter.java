import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkCharacterType(char ch) {
        char lowerCh = ch;
        if (ch >= 'A' && ch <= 'Z') {
            lowerCh = (char)(ch + 32);
        }

        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            return "Vowel";
        } else if ((lowerCh >= 'a' && lowerCh <= 'z')) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacterType(ch);
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}