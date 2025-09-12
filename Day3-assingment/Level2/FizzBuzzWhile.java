import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 0){ System.out.println("Invalid"); in.close(); return; }
        int i=1;
        while(i<=n){
            if(i%15==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
        in.close();
    }
}
