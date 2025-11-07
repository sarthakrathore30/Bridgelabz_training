import java.util.*;
class Product {
    double price;
    Product(String name, double price) {
        this.price = price;
    }
}
class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    Order(int orderId) {
        this.orderId = orderId;
    }
    void addProduct(Product p) {
        products.add(p);
    }
    double totalAmount() {
        double total = 0;
        for (Product p : products) total += p.price;
        return total;
    }
}
class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        System.out.println(name + " placed order #" + o.orderId + " worth $" + o.totalAmount());
    }
}
public class EcommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Mouse", 25);
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);
        Customer c = new Customer("Alice");
        c.placeOrder(o1);
    }
}
