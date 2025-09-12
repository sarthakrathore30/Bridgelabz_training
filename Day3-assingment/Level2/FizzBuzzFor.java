import java.util.Scanner;
public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 0){ System.out.println("Invalid"); in.close(); return; }
        for(int i=1;i<=n;i++){
            if(i%15==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
        in.close();
    }
}
