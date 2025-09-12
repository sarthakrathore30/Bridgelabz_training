import java.util.*;
public class BMIForTeam1D {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    double[] weight=new double[number];
    double[] height=new double[number];
    double[] bmi=new double[number];
    String[] status=new String[number];
    for(int i=0;i<number;i++){ weight[i]=in.nextDouble(); height[i]=in.nextDouble(); double h=height[i]/100.0; bmi[i]=weight[i]/(h*h); status[i]= bmi[i]<=18.4?"Underweight": bmi[i]<25?"Normal": bmi[i]<40?"Overweight":"Obese"; }
    for(int i=0;i<number;i++) System.out.println(weight[i]+" "+height[i]+" "+String.format("%.2f",bmi[i])+" "+status[i]);
    in.close();
  }
}
