public class Vehicle {
    private String ownerName;
    private String Type;
    private static double fees = 150.0;
    public Vehicle(String ownerName, String Type) {
        this.ownerName = ownerName;
        this.Type = Type;
    }
    public void VehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + Type + ", Fee: $" + fees);
    }
    public static void RegistrationFee(double newFee) {
        fees = newFee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Tom", "Car");
        v1.VehicleDetails();
        Vehicle.RegistrationFee(200);
        Vehicle v2 = new Vehicle("Lisa", "Bike");
        v2.VehicleDetails();
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
}
