public class Patient extends Person {
    private static int nextID = 1;
    private String id;

    Patient(String name, int age, double temperature) {
        suepr(name,age,temperature);
        this.id = "P" + nextID++;
    }

    String getID() {
        return id;
    }

    public String toString() {
        return "Name:" + name + ", ID:" + ID +", Age:" + age +", Temperature:" + temperature + "C";
    }
}
