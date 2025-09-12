import java.util.*;
public class DigitFrequency {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    long number=in.nextLong();
    ArrayList<Integer> digits=new ArrayList<>();
    long n=Math.abs(number); if(n==0) digits.add(0);
    while(n!=0){ digits.add((int)(n%10)); n/=10; }
    int[] freq=new int[10];
    for(int d:digits) freq[d]++;
    for(int i=0;i<10;i++) System.out.println(i+":"+freq[i]);
    in.close();
  }
}
