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
    public HotelBooking(HotelBooking booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }
    public void showBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking b2 = new HotelBooking(b1);
        b1.showBooking();
        b2.showBooking();
    }
}
