import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        scanner.close();
    }
}