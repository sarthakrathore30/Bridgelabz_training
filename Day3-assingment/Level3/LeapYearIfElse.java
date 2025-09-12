import java.util.Scanner;
public class LeapYearIfElse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int y=in.nextInt();
        if(y<1582){ System.out.println("Invalid"); }
        else if(y%400==0) System.out.println("Leap Year");
        else if(y%100==0) System.out.println("Not Leap Year");
        else if(y%4==0) System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
        in.close();
    }
}
