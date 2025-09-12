import java.util.*;
public class Copy2DTo1D {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int rows=in.nextInt(); int cols=in.nextInt();
    int[][] a=new int[rows][cols];
    for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) a[i][j]=in.nextInt();
    int[] b=new int[rows*cols]; int k=0;
    for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) b[k++]=a[i][j];
    for(int i=0;i<b.length;i++) System.out.print(b[i]+(i+1<b.length?" ":"
"));
    in.close();
  }
}
