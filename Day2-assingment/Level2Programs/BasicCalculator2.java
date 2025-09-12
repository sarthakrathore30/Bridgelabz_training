import java.util.Scanner;
public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("Addition: " + add + ", Subtraction: " + sub + ", Multiplication: " + mul + ", Division: " + div);
        input.close();
    }
}
//