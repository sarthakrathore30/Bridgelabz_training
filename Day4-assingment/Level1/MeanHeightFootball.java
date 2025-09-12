import java.util.*;
public class MeanHeightFootball {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    double[] heights=new double[11];
    double sum=0;
    for(int i=0;i<11;i++){ heights[i]=in.nextDouble(); sum+=heights[i]; }
    System.out.println(sum/11.0);
    in.close();
  }
}
