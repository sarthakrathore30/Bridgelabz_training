import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number % 5 == 0 ? "Yes" : "No");
        in.close();
    }
}
