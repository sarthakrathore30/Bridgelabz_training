import java.util.Scanner;
public class LeapYearLogical {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int y=in.nextInt();
        boolean leap = y>=1582 && ( (y%400==0) || (y%4==0 && y%100!=0) );
        System.out.println(leap?"Leap Year":"Not Leap Year");
        in.close();
    }
}
