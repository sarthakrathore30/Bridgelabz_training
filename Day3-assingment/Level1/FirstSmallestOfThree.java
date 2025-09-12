import java.util.Scanner;
public class FirstSmallestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean isSmallest = a <= b && a <= c;
        System.out.println(isSmallest ? "Yes" : "No");
        in.close();
    }
}
