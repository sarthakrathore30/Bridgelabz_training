import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        setDailyRate();
    }

    private void setDailyRate() {
        switch (carModel.toLowerCase()) {
            case "economy":
                dailyRate = 30.0;
                break;
            case "compact":
                dailyRate = 45.0;
                break;
            case "luxury":
                dailyRate = 100.0;
                break;
            default:
                dailyRate = 50.0;
        }
    }

    public double calculateTotalCost() {
        return dailyRate * rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter car model (Economy/Compact/Luxury): ");
        String model = scanner.nextLine();

        System.out.print("Enter rental days: ");
        int days = scanner.nextInt();

        CarRental rental = new CarRental(name, model, days);

        System.out.println("\n=== Rental Details ===");
        rental.displayRentalDetails();

        scanner.close();
    }
}