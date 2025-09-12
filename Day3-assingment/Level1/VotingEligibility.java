import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(age >= 18 ? "Can vote" : "Cannot vote");
        in.close();
    }
}
