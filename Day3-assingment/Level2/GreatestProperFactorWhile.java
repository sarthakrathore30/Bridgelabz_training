import java.util.Scanner;
public class GreatestProperFactorWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int counter = number - 1;
        int greatest = 1;
        while(counter >= 1){ if(number % counter == 0){ greatest = counter; break; } counter--; }
        System.out.println(greatest);
        in.close();
    }
}
