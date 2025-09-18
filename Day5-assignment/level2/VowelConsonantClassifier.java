import java.util.Scanner;

public class VowelConsonantClassifier {

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

    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    public static void displayTabular(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------\t----");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] classification = classifyCharacters(input);
        displayTabular(classification);

        scanner.close();
    }
}