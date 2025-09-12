import java.util.*;
public class FactorsDynamicArray {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    int maxFactor=10; int[] factors=new int[maxFactor]; int idx=0;
    for(int i=1;i<=number;i++){
      if(number%i==0){
        if(idx==maxFactor){ maxFactor*=2; int[] tmp=new int[maxFactor]; System.arraycopy(factors,0,tmp,0,idx); factors=tmp; }
        factors[idx++]=i;
      }
    }
    for(int i=0;i<idx;i++) System.out.print(factors[i]+(i+1<idx?" ":"
"));
    in.close();
  }
}
