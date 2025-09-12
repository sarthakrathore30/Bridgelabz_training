import java.util.Scanner;
public class FactorsFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number <= 0){ System.out.println("Invalid"); in.close(); return; }
        for(int i=1;i<=number;i++) if(number % i == 0) System.out.println(i);
        in.close();
    }
}
