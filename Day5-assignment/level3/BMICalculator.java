import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static String[][] calculateTeamBMI(double[][] heightWeight) {
        String[][] result = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double height = heightWeight[i][0] / 100;
            double weight = heightWeight[i][1];
            double bmi = calculateBMI(height, weight);
            String status = getBMIStatus(bmi);

            result[i][0] = String.valueOf(heightWeight[i][0]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.1f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("----------\t----------\t---\t------");

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t\t" + results[i][1] + 
                             "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = scanner.nextInt();

        double[][] heightWeight = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            heightWeight[i][0] = scanner.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        String[][] results = calculateTeamBMI(heightWeight);
        displayResults(results);

        scanner.close();
    }
}