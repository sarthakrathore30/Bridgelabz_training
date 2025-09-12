import java.util.Scanner;
public class NaturalNumberSumCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 0){
            int sum = n * (n + 1) / 2;
            System.out.println("Sum is " + sum);
        } else {
            System.out.println("Not a natural number");
        }
        in.close();
    }
}
