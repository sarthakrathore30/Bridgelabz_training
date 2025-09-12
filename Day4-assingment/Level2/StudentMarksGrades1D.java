import java.util.*;
public class StudentMarksGrades1D {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] p=new int[n]; int[] c=new int[n]; int[] m=new int[n];
    double[] perc=new double[n]; String[] grade=new String[n];
    for(int i=0;i<n;i++){ p[i]=in.nextInt(); c[i]=in.nextInt(); m[i]=in.nextInt(); double avg=(p[i]+c[i]+m[i])/3.0; perc[i]=avg; grade[i]= avg>=80?"A": avg>=70?"B": avg>=60?"C": avg>=50?"D": avg>=40?"E":"R"; }
    for(int i=0;i<n;i++) System.out.println(p[i]+" "+c[i]+" "+m[i]+" "+String.format("%.2f",perc[i])+" "+grade[i]);
    in.close();
  }
}
