import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String str) {
        int[] frequency = new int[256];
        char[] chars = new char[256];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;

            boolean exists = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (chars[j] == ch) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                chars[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        for (int i = 0; i < uniqueCount; i++) {
            result[i][0] = String.valueOf(chars[i]);
            result[i][1] = String.valueOf(frequency[chars[i]]);
        }

        return result;
    }

    public static void displayFrequency(String[][] frequency) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequency = findFrequency(input);
        displayFrequency(frequency);

        scanner.close();
    }
}