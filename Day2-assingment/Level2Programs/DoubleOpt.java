import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();
        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;
        System.out.println("The results of Double Operations are " + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
        in.close();
    }
}
