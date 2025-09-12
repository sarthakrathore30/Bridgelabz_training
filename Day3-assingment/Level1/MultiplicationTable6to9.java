import java.util.Scanner;
public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i=6;i<=9;i++) System.out.println(number + " * " + i + " = " + (number*i));
        in.close();
    }
}
