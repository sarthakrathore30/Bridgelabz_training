import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double first=in.nextDouble();
        double second=in.nextDouble();
        String op=in.next();
        double res;
        switch(op){
            case "+": res=first+second; System.out.println(res); break;
            case "-": res=first-second; System.out.println(res); break;
            case "*": res=first*second; System.out.println(res); break;
            case "/": res=second!=0?first/second:Double.NaN; System.out.println(res); break;
            default: System.out.println("Invalid Operator");
        }
        in.close();
    }
}
