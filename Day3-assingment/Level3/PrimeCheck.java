import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<=1){ System.out.println("Not Prime"); in.close(); return; }
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++){ if(n%i==0){ isPrime=false; break; } }
        System.out.println(isPrime?"Prime":"Not Prime");
        in.close();
    }
}
