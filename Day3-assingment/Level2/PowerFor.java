import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int power = in.nextInt();
        if(power < 0){ System.out.println("Invalid"); in.close(); return; }
        long result = 1;
        for(int i=1;i<=power;i++) result *= number;
        System.out.println(result);
        in.close();
    }
}
