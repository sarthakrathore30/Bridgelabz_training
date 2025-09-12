import java.util.*;
public class StudentMarksGrades2D {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[][] marks=new int[n][3]; double[] perc=new double[n]; String[] grade=new String[n];
    for(int i=0;i<n;i++){ for(int j=0;j<3;j++) marks[i][j]=in.nextInt(); double avg=(marks[i][0]+marks[i][1]+marks[i][2])/3.0; perc[i]=avg; grade[i]= avg>=80?"A": avg>=70?"B": avg>=60?"C": avg>=50?"D": avg>=40?"E":"R"; }
    for(int i=0;i<n;i++) System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]+" "+String.format("%.2f",perc[i])+" "+grade[i]);
    in.close();
  }
}
