import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number <= 0){ System.out.println("Invalid"); in.close(); return; }
        int i=1;
        while(i<=number){ if(number % i == 0) System.out.println(i); i++; }
        in.close();
    }
}
