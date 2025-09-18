import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 1;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][3];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(i + 1);
            result[i][1] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][2] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][2] = "Can Vote";
            } else {
                result[i][2] = "Cannot Vote";
            }
        }

        return result;
    }

    public static void displayTabular(String[][] data) {
        System.out.println("\nStudent\tAge\tVoting Status");
        System.out.println("-------\t---\t-------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students (up to 10): ");
        int n = scanner.nextInt();

        if (n > 10) {
            n = 10;
            System.out.println("Limited to 10 students.");
        }

        int[] ages = generateAges(n);
        String[][] eligibilityData = checkVotingEligibility(ages);

        displayTabular(eligibilityData);

        scanner.close();
    }
}