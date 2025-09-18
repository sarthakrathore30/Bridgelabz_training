public class ArrayIndexOutOfBoundsDemo {

    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[3]);
    }

    public static void handleException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException was handled.");
        } catch (RuntimeException e) {
            System.out.println("A generic runtime exception occurred.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to handle the exception:");
        handleException();

        System.out.println("\nCalling method to generate the exception (will crash):");
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught generated exception in main: " + e);
        }
    }
}