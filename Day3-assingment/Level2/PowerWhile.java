import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int power = in.nextInt();
        if(power < 0){ System.out.println("Invalid"); in.close(); return; }
        long result = 1;
        int counter = 0;
        while(counter < power){ result *= number; counter++; }
        System.out.println(result);
        in.close();
    }
}
