import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException was handled.");
        } catch (RuntimeException e) {
            System.out.println("A generic runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (at least 6 characters long): ");
        String input = scanner.nextLine();

        System.out.println("\nCalling method to handle the exception:");
        handleException(input);

        System.out.println("\nCalling method to generate the exception (will crash):");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught generated exception in main: " + e);
        }

        scanner.close();
    }
}