import java.util.*;
class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}
class CourseU {
    String name;
    Professor professor;
    CourseU(String name) {
        this.name = name;
    }
        void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " assigned to " + name);
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
class StudentU {
    String name;
    List<CourseU> courses = new ArrayList<>();
    StudentU(String name) {
        this.name = name;
    }
    void enrollCourse(CourseU c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}
public class UniversityManagementDemo {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Allen");
        CourseU course = new CourseU("Data Structures");
        StudentU student = new StudentU("Sophia");
        course.assignProfessor(prof);
        student.enrollCourse(course);
    }
}
