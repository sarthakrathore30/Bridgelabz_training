import java.util.Scanner;

public class Manager extends Employee {
    private String teamName;
    private int teamSize;

    public Manager(int employeeID, String department, double salary, String teamName, int teamSize) {
        super(employeeID, department, salary);
        this.teamName = teamName;
        this.teamSize = teamSize;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("=== Manager Details ===");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team Name: " + teamName);
        System.out.println("Team Size: " + teamSize);
    }

    public void giveRaise(double percentage) {
        double currentSalary = getSalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        setSalary(newSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter team name: ");
        String team = scanner.nextLine();

        System.out.print("Enter team size: ");
        int size = scanner.nextInt();

        Manager manager = new Manager(id, dept, salary, team, size);
        manager.displayEmployeeDetails();

        System.out.print("\nEnter raise percentage: ");
        double raise = scanner.nextDouble();
        manager.giveRaise(raise);

        System.out.println("\nUpdated Details:");
        manager.displayEmployeeDetails();

        scanner.close();
    }
}