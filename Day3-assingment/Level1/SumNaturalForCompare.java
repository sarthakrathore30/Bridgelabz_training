import java.util.Scanner;
public class SumNaturalForCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 0){
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            for(int i=1;i<=n;i++) sumFor += i;
            System.out.println(sumFormula + "," + sumFor);
        } else {
            System.out.println("Not a natural number");
        }
        in.close();
    }
}
