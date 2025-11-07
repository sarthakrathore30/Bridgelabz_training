public class Product {
    private String name;
    private double price;
    private static int totalProducts = 0;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }
    public void Details() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Phone", 500);
        p1.Details();
        p2.Details();
        Product.displayTotalProducts();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
