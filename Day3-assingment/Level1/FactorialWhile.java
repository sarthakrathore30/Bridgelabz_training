import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0){ System.out.println("Invalid"); in.close(); return; }
        long fact = 1;
        int i = 1;
        while(i <= n){ fact *= i; i++; }
        System.out.println(fact);
        in.close();
    }
}
