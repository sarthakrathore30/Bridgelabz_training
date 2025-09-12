import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.print("Enter c: ");
        int c = in.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
        System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
        in.close();
    }
}
