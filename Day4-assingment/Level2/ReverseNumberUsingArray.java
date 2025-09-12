import java.util.*;
public class ReverseNumberUsingArray {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    long number=in.nextLong();
    ArrayList<Integer> list=new ArrayList<>();
    long n=Math.abs(number); if(n==0) list.add(0);
    while(n!=0){ list.add((int)(n%10)); n/=10; }
    for(int i=0;i<list.size();i++){ System.out.print(list.get(i)); }
    System.out.println();
    in.close();
  }
}
