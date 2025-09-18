import java.util.Scanner;
import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getItemTotal());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        double totalCost = 0;

        System.out.println("Shopping Cart System");
        System.out.println("===================");

        while (true) {
            System.out.println("\n1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display total cost");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    CartItem item = new CartItem(name, price, quantity);
                    cart.add(item);
                    totalCost += item.getItemTotal();

                    System.out.println("Item added to cart!");
                    break;

                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                        break;
                    }

                    System.out.println("Items in cart:");
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        cart.get(i).displayItem();
                    }

                    System.out.print("Enter item number to remove: ");
                    int itemIndex = scanner.nextInt() - 1;

                    if (itemIndex >= 0 && itemIndex < cart.size()) {
                        CartItem removedItem = cart.remove(itemIndex);
                        totalCost -= removedItem.getItemTotal();
                        System.out.println("Item removed from cart!");
                    } else {
                        System.out.println("Invalid item number!");
                    }
                    break;

                case 3:
                    System.out.println("\nCart Contents:");
                    for (CartItem cartItem : cart) {
                        cartItem.displayItem();
                    }
                    System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}