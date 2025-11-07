public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("The Hobbit", "J.R.R. Tolkien", 15.99);
        b1.borrowBook();
        b1.borrowBook();
    }
    public String getTitle() {
        return title;
    }
   public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
