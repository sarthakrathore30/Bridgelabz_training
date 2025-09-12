import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=n,sum=0;
        while(t>0){ sum+=t%10; t/=10; }
        System.out.println(sum!=0 && n%sum==0?"Harshad":"Not Harshad");
        in.close();
    }
}
