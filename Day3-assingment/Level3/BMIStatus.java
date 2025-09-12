import java.util.Scanner;
public class BMIStatus {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double weight=in.nextDouble();
        double heightCm=in.nextDouble();
        double heightM=heightCm/100.0;
        double bmi=weight/(heightM*heightM);
        String status = bmi<=18.4?"Underweight": bmi<25?"Normal": bmi<40?"Overweight":"Obese";
        System.out.println(String.format("%.2f ",bmi)+status);
        in.close();
    }
}
