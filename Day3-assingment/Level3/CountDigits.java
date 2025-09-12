import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        n=Math.abs(n);
        if(n==0){ System.out.println(1); in.close(); return; }
        int c=0;
        while(n!=0){ n/=10; c++; }
        System.out.println(c);
        in.close();
    }
}
