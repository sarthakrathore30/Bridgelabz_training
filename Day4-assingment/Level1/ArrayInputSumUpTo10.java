import java.util.*;
public class ArrayInputSumUpTo10 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    double[] arr=new double[10];
    double total=0.0; int idx=0;
    while(true){
      double val=in.nextDouble();
      if(val<=0 || idx==10) break;
      arr[idx++]=val; total+=val;
    }
    for(int i=0;i<idx;i++) System.out.print(arr[i]+(i+1<idx?" ":"
"));
    System.out.println(total);
    in.close();
  }
}
