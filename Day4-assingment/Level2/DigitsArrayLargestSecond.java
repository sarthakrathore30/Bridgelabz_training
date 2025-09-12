import java.util.*;
public class DigitsArrayLargestSecond {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    long number=in.nextLong();
    int maxDigit=10; int[] digits=new int[maxDigit]; int index=0;
    long n=Math.abs(number);
    if(n==0){ digits[index++]=0; }
    while(n!=0){ if(index==maxDigit){ break; } digits[index++]=(int)(n%10); n/=10; }
    int largest=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
    for(int i=0;i<index;i++){ int d=digits[i]; if(d>largest){ second=largest; largest=d; } else if(d>second && d!=largest){ second=d; } }
    System.out.println(largest+" "+second);
    in.close();
  }
}
