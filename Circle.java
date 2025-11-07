public class Circle {
    private double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        System.out.println("Default Circle Area: " + c1.getArea());
        System.out.println("Custom Circle Area: " + c2.getArea());
    }
}
