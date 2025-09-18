import java.util.Scanner;

public class TriangularParkRounds {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter, double distance) {
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first side of triangle (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter second side of triangle (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter third side of triangle (meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);
        int rounds = calculateRounds(perimeter, 5000);

        System.out.println("Perimeter of triangle: " + perimeter + " meters");
        System.out.println("Number of rounds needed for 5km: " + rounds);

        scanner.close();
    }
}