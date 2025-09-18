import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(int newSeatNumber, double newPrice) {
        this.seatNumber = newSeatNumber;
        this.price = newPrice;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter initial seat number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.displayTicketDetails();

        System.out.print("\nDo you want to book a different seat? (y/n): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            System.out.print("Enter new seat number: ");
            int newSeat = scanner.nextInt();

            System.out.print("Enter new price: ");
            double newPrice = scanner.nextDouble();

            ticket.bookTicket(newSeat, newPrice);
            ticket.displayTicketDetails();
        }

        scanner.close();
    }
}