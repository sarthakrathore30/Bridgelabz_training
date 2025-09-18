import java.util.Scanner;

public class CircleWithChaining {
    private double radius;

    public CircleWithChaining() {
        this(1.0);
    }

    public CircleWithChaining(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", getArea()));
        System.out.println("Circumference: " + String.format("%.2f", getCircumference()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating circle with default constructor:");
        CircleWithChaining defaultCircle = new CircleWithChaining();
        defaultCircle.displayDetails();

        System.out.println("\nCreating circle with user input:");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        CircleWithChaining userCircle = new CircleWithChaining(radius);

        System.out.println("\n=== Circle Details ===");
        userCircle.displayDetails();

        scanner.close();
    }
}