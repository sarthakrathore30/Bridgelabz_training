import java.util.Scanner;
public class AllMultiplesBelow100For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number <= 0 || number >= 100){ System.out.println("Invalid"); in.close(); return; }
        for(int i=100;i>=1;i--){ if(i % number == 0){ System.out.println(i); } }
        in.close();
    }
}
