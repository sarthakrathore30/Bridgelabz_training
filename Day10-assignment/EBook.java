import java.util.Scanner;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String ISBN, String title, String author, double fileSize, String format) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("=== E-Book Details ===");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter file size (MB): ");
        double size = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter format: ");
        String format = scanner.nextLine();

        EBook ebook = new EBook(isbn, title, author, size, format);
        ebook.displayBookDetails();

        System.out.print("\nEnter new author name: ");
        String newAuthor = scanner.nextLine();
        ebook.setAuthor(newAuthor);

        System.out.println("\nUpdated Details:");
        ebook.displayBookDetails();

        scanner.close();
    }
}