import java.util.*;
class Vehicle { }
class Truck extends Vehicle { }
class Bike extends Vehicle { }
class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T v) { fleet.add(v); }
    public void showFleet() {
        for (T v : fleet)
            System.out.println(v.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck());
        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike());
        truckFleet.showFleet();
        bikeFleet.showFleet();
    }
    public List<T> getFleet() {
        return fleet;
    }
    public void setFleet(List<T> fleet) {
        this.fleet = fleet;
    }
}
