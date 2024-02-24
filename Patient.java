import java.util.Scanner;

public class Patient extends Person {
    private int id;

    public Patient(Scanner scanner, String name, int age, double temperature, int id) {
        super(name, age, temperature);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return String.valueOf(id);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                '}';
    }
}
