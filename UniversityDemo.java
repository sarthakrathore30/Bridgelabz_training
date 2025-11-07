import java.util.*;
class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Faculty: " + name);
    }
}
class DepartmentU {
    String deptName;
    DepartmentU(String deptName) {
        this.deptName = deptName;
    }
    void show() {
        System.out.println("Department: " + deptName);
    }
}
class University {
    String name;
    List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) {
        this.name = name;
    }
    void addDepartment(DepartmentU d) {
        departments.add(d);
    }
    void addFaculty(Faculty f) {
        faculties.add(f);
    }
    void showDetails() {
        System.out.println("University: " + name);
        for (DepartmentU d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
    void closeUniversity() {
        departments.clear(); // composition: departments destroyed
        System.out.println("University closed. Departments removed. Faculties remain.");
    }
}
public class UniversityDemo {
    public static void main(String[] args) {
        University u = new University("Stanford");
        DepartmentU cs = new DepartmentU("Computer Science");
        Faculty prof = new Faculty("Dr. Smith");
        u.addDepartment(cs);
        u.addFaculty(prof);
        u.showDetails();
        u.closeUniversity();
    }
}
