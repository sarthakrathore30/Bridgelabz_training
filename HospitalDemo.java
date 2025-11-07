import java.util.*;
class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}
class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
    }
}
class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String name) {
    }
    void addDoctor(Doctor d) {
        doctors.add(d);
    }
    void addPatient(Patient p) {
        patients.add(p);
    }
}
public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Miller");
        Doctor d2 = new Doctor("Jane");
        Patient p1 = new Patient("Tom");
        Patient p2 = new Patient("Sara");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d2.consult(p2);
    }
}
