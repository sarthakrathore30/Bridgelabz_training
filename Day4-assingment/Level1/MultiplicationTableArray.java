import java.util.*;
public class MultiplicationTableArray {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    int[] table=new int[10];
    for(int i=1;i<=10;i++) table[i-1]=number*i;
    for(int i=1;i<=10;i++) System.out.println(number+" * "+i+" = "+table[i-1]);
    in.close();
  }
}
