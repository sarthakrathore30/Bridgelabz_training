import java.util.Scanner;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book '" + title + "' borrowed successfully!");
        } else {
            System.out.println("Book '" + title + "' is not available!");
        }
    }

    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("Book '" + title + "' returned successfully!");
        } else {
            System.out.println("Book '" + title + "' was not borrowed!");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price, true);

        while (true) {
            System.out.println("\n=== Library System ===");
            book.displayBookDetails();

            System.out.println("\n1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book.borrowBook();
                    break;
                case 2:
                    book.returnBook();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}