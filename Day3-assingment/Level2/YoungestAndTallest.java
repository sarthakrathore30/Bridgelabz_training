import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age1 = in.nextInt();
        int h1 = in.nextInt();
        int age2 = in.nextInt();
        int h2 = in.nextInt();
        int age3 = in.nextInt();
        int h3 = in.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));
        System.out.println(youngest + "," + tallest);
        in.close();
    }
}
