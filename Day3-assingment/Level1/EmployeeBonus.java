import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        int years = in.nextInt();
        double bonus = years > 5 ? salary * 0.05 : 0.0;
        System.out.println(bonus);
        in.close();
    }
}
