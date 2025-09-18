import java.util.Scanner;

public class BookWithConstructors {
    private String title;
    private String author;
    private double price;

    public BookWithConstructors() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public BookWithConstructors(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating book with default constructor:");
        BookWithConstructors defaultBook = new BookWithConstructors();
        defaultBook.displayBookDetails();

        System.out.println("\nCreating book with parameterized constructor:");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        BookWithConstructors parameterizedBook = new BookWithConstructors(title, author, price);

        System.out.println("\n=== Book Details ===");
        parameterizedBook.displayBookDetails();

        scanner.close();
    }
}