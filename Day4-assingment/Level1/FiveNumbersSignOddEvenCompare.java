import java.util.*;
public class FiveNumbersSignOddEvenCompare {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int[] a=new int[5];
    for(int i=0;i<5;i++) a[i]=in.nextInt();
    for(int x:a){
      if(x>0){ System.out.print("Positive "); System.out.println(x%2==0?"Even":"Odd"); }
      else if(x<0) System.out.println("Negative");
      else System.out.println("Zero");
    }
    if(a[0]==a[4]) System.out.println("Equal");
    else if(a[0]>a[4]) System.out.println("FirstGreater");
    else System.out.println("LastGreater");
    in.close();
  }
}
