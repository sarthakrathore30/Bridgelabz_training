import java.util.Scanner;

public class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(String rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("=== Postgraduate Student Details ===");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        String roll = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter specialization: ");
        String spec = scanner.nextLine();

        PostgraduateStudent pgStudent = new PostgraduateStudent(roll, name, cgpa, spec);
        pgStudent.displayStudentDetails();

        System.out.print("\nEnter new CGPA to update: ");
        double newCGPA = scanner.nextDouble();
        pgStudent.setCGPA(newCGPA);

        System.out.println("\nUpdated Details:");
        pgStudent.displayStudentDetails();

        scanner.close();
    }
}