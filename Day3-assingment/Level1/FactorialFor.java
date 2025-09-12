import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0){ System.out.println("Invalid"); in.close(); return; }
        long fact = 1;
        for(int i=1;i<=n;i++) fact *= i;
        System.out.println(fact);
        in.close();
    }
}
