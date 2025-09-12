import java.util.Scanner;
public class LargestChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a >= b && a >= c ? "First is largest" : "First is not largest");
        System.out.println(b >= a && b >= c ? "Second is largest" : "Second is not largest");
        System.out.println(c >= a && c >= b ? "Third is largest" : "Third is not largest");
        in.close();
    }
}
