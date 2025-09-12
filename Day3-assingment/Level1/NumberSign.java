import java.util.Scanner;
public class NumberSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num > 0) System.out.println("Positive");
        else if(num < 0) System.out.println("Negative");
        else System.out.println("Zero");
        in.close();
    }
}
