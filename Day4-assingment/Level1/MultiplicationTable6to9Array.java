import java.util.*;
public class MultiplicationTable6to9Array {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    int[] res=new int[4];
    for(int i=6;i<=9;i++) res[i-6]=number*i;
    for(int i=6;i<=9;i++) System.out.println(number+" * "+i+" = "+res[i-6]);
    in.close();
  }
}
