import java.util.Scanner;
public class GradesPercentage {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int c=in.nextInt();
        int m=in.nextInt();
        double avg=(p+c+m)/3.0;
        String grade, remark;
        if(avg>=80){ grade="A"; remark="Level 4"; }
        else if(avg>=70){ grade="B"; remark="Level 3"; }
        else if(avg>=60){ grade="C"; remark="Level 2"; }
        else if(avg>=50){ grade="D"; remark="Level 1"; }
        else if(avg>=40){ grade="E"; remark="Level 1-"; }
        else { grade="R"; remark="Remedial"; }
        System.out.println(avg+" "+grade+" "+remark);
        in.close();
    }
}
