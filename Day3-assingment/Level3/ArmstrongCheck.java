import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int t=num,sum=0;
        while(t!=0){ int d=t%10; sum+=d*d*d; t/=10; }
        System.out.println(sum==num?"Armstrong":"Not Armstrong");
        in.close();
    }
}
