import java.util.Scanner;

public class NestedLoopFrequency {

    public static String[] findFrequencyWithNestedLoops(String str) {
        int length = str.length();
        String[] result = new String[length * 2];
        int resultIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int frequency = 0;

            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == currentChar) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < length; j++) {
                    if (str.charAt(j) == currentChar) {
                        frequency++;
                    }
                }

                result[resultIndex] = String.valueOf(currentChar);
                result[resultIndex + 1] = String.valueOf(frequency);
                resultIndex += 2;
            }
        }

        String[] finalResult = new String[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void displayFrequency(String[] frequency) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequency.length; i += 2) {
            System.out.println(frequency[i] + "\t\t" + frequency[i + 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequency = findFrequencyWithNestedLoops(input);
        displayFrequency(frequency);

        scanner.close();
    }
}