import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException was handled.");
        } catch (RuntimeException e) {
            System.out.println("A generic runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string that is not a number: ");
        String input = scanner.nextLine();

        System.out.println("\nCalling method to handle the exception:");
        handleException(input);

        System.out.println("\nCalling method to generate the exception (will crash):");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught generated exception in main: " + e);
        }

        scanner.close();
    }
}