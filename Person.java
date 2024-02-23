public abstract class Person {
    String name;
    int age;
    double temperature;

    Person(String name, int age, double temperature) {
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    public String toString() {
        return "Name:" + name +", Age:" + age +", Temperature:" + temperature +"C";
    }
    abstract String getID();
    }
