import java.util.*;
public class BMIForTeam2D {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int number=in.nextInt();
    double[][] personData=new double[number][3];
    String[] weightStatus=new String[number];
    for(int i=0;i<number;i++){ double w=in.nextDouble(); double h=in.nextDouble(); personData[i][0]=w; personData[i][1]=h; double hm=h/100.0; personData[i][2]=w/(hm*hm); weightStatus[i]= personData[i][2]<=18.4?"Underweight": personData[i][2]<25?"Normal": personData[i][2]<40?"Overweight":"Obese"; }
    for(int i=0;i<number;i++) System.out.println(personData[i][0]+" "+personData[i][1]+" "+String.format("%.2f",personData[i][2])+" "+weightStatus[i]);
    in.close();
  } 
  
}

