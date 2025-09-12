import java.util.Scanner;
public class OddEvenUpToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1){ System.out.println("Invalid"); in.close(); return; }
        for(int i=1;i<=n;i++) System.out.println(i + ":" + (i%2==0?"Even":"Odd"));
        in.close();
    }
}
