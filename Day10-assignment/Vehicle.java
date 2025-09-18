import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new registration fee: ");
        double newFee = scanner.nextDouble();
        scanner.nextLine();
        Vehicle.updateRegistrationFee(newFee);

        System.out.print("\nEnter owner name: ");
        String owner = scanner.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = scanner.nextLine();

        Vehicle vehicle = new Vehicle(owner, type);

        System.out.println("\n=== Vehicle Details ===");
        vehicle.displayVehicleDetails();

        scanner.close();
    }
}