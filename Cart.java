import java.util.*;
class Cart<T> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() {
        for (T i : items) System.out.println(i);
    }
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Phone");
        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("Shirt");
        clothesCart.addItem("Jeans");
        System.out.println("Electronics:");
        electronicsCart.displayItems();
        System.out.println("Clothes:");
        clothesCart.displayItems();
    }
    public List<T> getItems() {
        return items;
    }
    public void setItems(List<T> items) {
        this.items = items;
    }
}
