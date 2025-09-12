import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        while(true){
            double x = in.nextDouble();
            if(x <= 0) break;
            total += x;
        }
        System.out.println(total);
        in.close();
    }
}
