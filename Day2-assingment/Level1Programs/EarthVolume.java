public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInMiles = volume * Math.pow(0.621371, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + volumeInMiles);
    }
}
