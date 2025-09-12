import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();
        double heightFeet = heightCm / 30.48;
        double heightInches = heightCm / 2.54;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
        input.close();
    }
}
