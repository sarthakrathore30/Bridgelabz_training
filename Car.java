public class Car {
    private String name;
    private String model;
    private int days;
    private double totalCost;
    public Car() {
        this("Unknown", "Standard", 1);
    }
    public Car(String name, String model, int days) {
        this.name = name;
        this.model = model;
        this.days = days;
        this.totalCost = total();
    }
    private double total() {
        double rate = 50.0; 
        return rate * days;
    }
    public void rentDetails() {
        System.out.println(name + " rented " + model + " for " + days + " days. Total: $" + totalCost);
    }
    public static void main(String[] args) {
        Car r1 = new Car("Alice", "Toyota", 3);
        r1.rentDetails();
    }
}
