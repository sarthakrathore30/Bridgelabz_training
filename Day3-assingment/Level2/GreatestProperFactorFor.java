import java.util.Scanner;
public class GreatestProperFactorFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int greatest = 1;
        for(int i=number-1;i>=1;i--){ if(number % i == 0){ greatest = i; break; } }
        System.out.println(greatest);
        in.close();
    }
}
