import java.util.Scanner;

public class FrequentCharacterFinder {

    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = frequency[str.charAt(0)];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Empty string provided!");
            return;
        }

        char mostFrequent = findMostFrequentCharacter(input);

        System.out.println("String: '" + input + "'");
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        scanner.close();
    }
}