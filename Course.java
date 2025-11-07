public class Course {
    private String course;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Academy";
    public Course(String course, int duration, double fee) {
        this.course = course;
        this.duration = duration;
        this.fee = fee;
    }
    public void courseDetails() {
        System.out.println("Course: " + course + ", Duration: " + duration + " months, Fee: $" + fee + ", Institute: " + instituteName);
    }
    public static void Institute_name(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 500);
        c1.courseDetails();
        Course.Institute_name("Code University");
        Course c2 = new Course("Python", 4, 400);
        c2.courseDetails();
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
