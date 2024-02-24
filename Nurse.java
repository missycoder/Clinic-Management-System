import java.util.Scanner;

public class Nurse extends Person {
    private int staffID;

    public Nurse(Scanner scanner, String name, int age, double temperature, int staffID) {
        super(name, age, temperature);
        this.staffID = staffID;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    @Override
    public String getID() {
        return String.valueOf(staffID);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "staffID=" + staffID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                '}';
    }
}
