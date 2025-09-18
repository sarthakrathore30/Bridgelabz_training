import java.util.Scanner;

public class NumberAnalyzer {

    public static String checkPositiveNegative(int number) {
        if (number > 0) return "positive";
        else if (number < 0) return "negative";
        else return "zero";
    }

    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }

    public static String compare(int num1, int num2) {
        if (num1 > num2) return "greater";
        else if (num1 < num2) return "less";
        else return "equal";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            String posNeg = checkPositiveNegative(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + posNeg);
            if (!posNeg.equals("zero")) {
                System.out.print(" and " + checkEvenOdd(numbers[i]));
            }
            System.out.println();
        }

        String comparison = compare(numbers[0], numbers[4]);
        System.out.println("First element is " + comparison + " than last element");

        scanner.close();
    }
}