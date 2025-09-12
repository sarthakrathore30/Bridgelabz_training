import java.util.Scanner;
public class QuotientRemainder2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + a + " and " + b);
        input.close();
    }
}
