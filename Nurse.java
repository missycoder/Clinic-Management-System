public class extends Person {
    private static int nextID = 1;
    private String staffID;

    Nurse(String name, int age, double temperature) {
        super(name, age, temperature);
        this.staffID = "S" +nextID++;
    }

    String getStaffID() {
        return staffID;
    }

    public String toString() {
        return "Name:" + name + ", "Staff ID:" + staffID +", Age:" + age +", Temperature:" + temperature + "C";
    }
}