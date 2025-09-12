import java.util.*;
public class OddEvenArrays {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    if(number<1){ System.out.println("Invalid"); return; }
    int size=number/2+1;
    int[] even=new int[size]; int[] odd=new int[size]; int ei=0,oi=0;
    for(int i=1;i<=number;i++){ if(i%2==0) even[ei++]=i; else odd[oi++]=i; }
    for(int i=0;i<oi;i++) System.out.print(odd[i]+(i+1<oi?" ":"
"));
    for(int i=0;i<ei;i++) System.out.print(even[i]+(i+1<ei?" ":"
"));
    in.close();
  }
}
