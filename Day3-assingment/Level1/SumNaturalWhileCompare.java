import java.util.Scanner;
public class SumNaturalWhileCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 0){
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0;
            int i = 1;
            while(i <= n){ sumWhile += i; i++; }
            System.out.println(sumFormula + "," + sumWhile);
        } else {
            System.out.println("Not a natural number");
        }
        in.close();
    }
}
