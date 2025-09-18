import java.util.Scanner;

public class CharacterRemover {

    public static String removeCharacter(String str, char charToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String result = removeCharacter(input, charToRemove);

        System.out.println("String: '" + input + "'");
        System.out.println("Character to Remove: '" + charToRemove + "'");
        System.out.println("Modified String: '" + result + "'");

        scanner.close();
    }
}