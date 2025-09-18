import java.util.Scanner;

public class FactorAnalyzer {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static int calculateSumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor * factor;
        return sum;
    }

    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    public static double calculateSumOfSquareRoots(int[] factors) {
        double sum = 0;
        for (int factor : factors) sum += Math.sqrt(factor);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");

        System.out.println("\nSum: " + calculateSum(factors));
        System.out.println("Sum of squares: " + calculateSumOfSquares(factors));
        System.out.println("Product: " + calculateProduct(factors));
        System.out.println("Sum of square roots: " + String.format("%.2f", calculateSumOfSquareRoots(factors)));

        scanner.close();
    }
}