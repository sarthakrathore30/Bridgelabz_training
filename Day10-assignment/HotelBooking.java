import java.util.Scanner;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public double calculateCost() {
        double rate = 0;
        switch (roomType.toLowerCase()) {
            case "standard":
                rate = 100;
                break;
            case "deluxe":
                rate = 150;
                break;
            case "suite":
                rate = 250;
                break;
            default:
                rate = 100;
        }
        return rate * nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: $" + calculateCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating default booking:");
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayBookingDetails();

        System.out.println("\nCreating custom booking:");
        System.out.print("Guest name: ");
        String name = scanner.nextLine();

        System.out.print("Room type (Standard/Deluxe/Suite): ");
        String room = scanner.nextLine();

        System.out.print("Number of nights: ");
        int nights = scanner.nextInt();

        HotelBooking customBooking = new HotelBooking(name, room, nights);

        System.out.println("\n=== Booking Details ===");
        customBooking.displayBookingDetails();

        scanner.close();
    }
}