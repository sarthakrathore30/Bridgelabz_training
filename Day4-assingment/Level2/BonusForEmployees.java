import java.util.*;
public class BonusForEmployees {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    double[] salary=new double[10];
    int[] years=new int[10];
    double[] newSalary=new double[10];
    double[] bonus=new double[10];
    double totalBonus=0,totalOld=0,totalNew=0;
    int i=0;
    while(i<10){
      double s=in.nextDouble();
      int y=in.nextInt();
      if(s<=0||y<0) continue;
      salary[i]=s; years[i]=y;
      i++;
    }
    for(i=0;i<10;i++){
      double rate= years[i]>5?0.05:0.02;
      bonus[i]=salary[i]*rate;
      newSalary[i]=salary[i]+bonus[i];
      totalBonus+=bonus[i]; totalOld+=salary[i]; totalNew+=newSalary[i];
    }
    System.out.println(totalBonus+" "+totalOld+" "+totalNew);
    in.close();
  }
}
