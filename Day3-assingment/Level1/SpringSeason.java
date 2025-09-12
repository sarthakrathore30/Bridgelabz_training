import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        boolean spring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
        in.close();
    }
}
