import java.util.Scanner;

public class PersonCopy {
    private String name;
    private int age;
    private String address;

    public PersonCopy(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public PersonCopy(PersonCopy other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for original person:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        PersonCopy original = new PersonCopy(name, age, address);
        PersonCopy copy = new PersonCopy(original);

        System.out.println("\n=== Original Person ===");
        original.displayDetails();

        System.out.println("\n=== Copied Person ===");
        copy.displayDetails();

        scanner.close();
    }
}