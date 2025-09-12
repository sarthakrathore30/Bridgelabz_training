import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / 5280;
        System.out.println("Your distance in yards is " + yards + " while in miles is " + miles);
        input.close();
    }
}
