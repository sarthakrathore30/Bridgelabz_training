import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        return age >= 18 && age > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("Student\tAge\tCan Vote?");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            String status = ages[i] < 0 ? "Invalid" : (canVote ? "Yes" : "No");
            System.out.println((i + 1) + "\t" + ages[i] + "\t" + status);
        }

        scanner.close();
    }
}