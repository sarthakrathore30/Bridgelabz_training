import java.util.*;
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Employee: " + name);
    }
}
class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();
    Department(String deptName) {
        this.deptName = deptName;
    }
    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}
class Company {
    String companyName;
    List<Department> departments = new ArrayList<>();
    Company(String companyName) {
        this.companyName = companyName;
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
    void showDepartments() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
    void closeCompany() {
        departments.clear();
        System.out.println("Company " + companyName + " closed. All departments and employees removed.");
    }
}
public class CompanyDemo {
        public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        Department it = new Department("IT");
        it.addEmployee("John");
        it.addEmployee("Emma");
        comp.addDepartment(it);
        comp.showDepartments();
        comp.closeCompany();
    }
}
