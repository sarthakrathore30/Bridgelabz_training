class University_management_system {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public University_management_system(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends University_management_system {
    private String thesisTopic;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }
    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Thesis: " + thesisTopic);
    }
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(1, "Alice", 3.9, "AI Research");
        pg.display();
    }
    public String getThesisTopic() {
        return thesisTopic;
    }
    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
}
