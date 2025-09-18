import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter institute name: ");
        String institute = scanner.nextLine();
        Course.updateInstituteName(institute);

        System.out.print("\nEnter number of courses: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + ":");
            System.out.print("Course name: ");
            String name = scanner.nextLine();

            System.out.print("Duration (months): ");
            int duration = scanner.nextInt();

            System.out.print("Fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine();

            courses[i] = new Course(name, duration, fee);
        }

        System.out.println("\n=== Course Details ===");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course " + (i + 1) + ":");
            courses[i].displayCourseDetails();
            System.out.println();
        }

        scanner.close();
    }
}