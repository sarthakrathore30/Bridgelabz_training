import java.util.Scanner;

public class BMIAnalyzer {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double heightCm = scanner.nextDouble();
            data[i][1] = heightCm;
            data[i][2] = calculateBMI(data[i][0], heightCm / 100);
        }

        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t%.0f\t%.1f\t%s\n", 
                            (i + 1), data[i][0], data[i][1], data[i][2], getBMIStatus(data[i][2]));
        }

        scanner.close();
    }
}