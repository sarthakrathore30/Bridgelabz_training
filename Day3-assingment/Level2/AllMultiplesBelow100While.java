import java.util.Scanner;
public class AllMultiplesBelow100While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number <= 0 || number >= 100){ System.out.println("Invalid"); in.close(); return; }
        int counter = number - 1;
        while(counter > 1){ if(100 % counter == 0){ } counter -= 1; }
        for(int i=100;i>=1;i--){ if(i % number == 0) System.out.println(i); }
        in.close();
    }
}
