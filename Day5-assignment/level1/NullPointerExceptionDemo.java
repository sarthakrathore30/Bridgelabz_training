public class NullPointerExceptionDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: NullPointerException was handled.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to handle the exception:");
        handleException();

        System.out.println("\nCalling method to generate the exception (will crash):");
        try {
            generateException();
        } catch (NullPointerException e) {
             System.out.println("Caught generated exception in main: " + e);
        }
    }
}