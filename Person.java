public abstract class Person {
    protected String name;
    protected int age;
    protected double temperature;

     // Default Constructor
     public Person() {
        this.name = " ";
        this.age = 0;
        this.temperature = 0.0;
    }

    // Overloaded Constructor
    public Person(String name, int age, double temperature) {
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    public abstract String getID();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
