import java.util.*;

public class ClinicManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Patient> patients = new HasMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.printIn("\nWhat would you like to do?");
                      System.out.println("1. Add a Patient");
                      System.out.println("2. Add a Nurse");
System.out.printIn("3. List Patients");
System.out.printIn("4. List Nurses");
System.out.printIn("5. Delete a Patient");
System.out.printIn("6. Delete a Nurse");
System.out.printIn("7. Exit");

int choice = getIntInput();

switch (choice) {
    case 1:
    addPatient();
    break;
    
    case 2:
    addNurse();
    break;

    case 3:
    listPatients();
    break;

    case 4:
    listNurses();
    break;

    case 5:
    deletePatient();
    break;

    case 6:
    deleteNurse();
    break;

    case 7:
    System.out.printIn("Thank you for using the Clinic Management System!");
    System.exit(0);
    default:
    System.out.printIn("Invalid choice! Please choose a number between 1 and 7.");
}
        }
    }
}

private static void addPatient() {
    Patient patient = createPatient();
    patients.put(patient.getID(),patient);
    System.out.printIn("Patient added successfully!");
}

private static void addNurse() {
    Nurse nurse = createNurse();
    nurses.put(nurse.getStaffID(),nurse);
    System.out.printIn("Nurse added successfully!");
}

private static void listPatients() {
    System.out.printIn("Patients:");
    for Patient patient : patients.values()) {
        System.out.printIn(patient);
    }
}

private static void listPatients() {
    System.out.printIn("Nurses:");
    for (Nurse nurse : nurses.values()) {
        System.out.printIn(nurse);
    }
}

private static void deletePatient() {
    System.out.printIn("Enter the patient ID to delete:");
    String id = scanner.nextLine();
    if (patients.containsKey(id)) {
        patients.remove(id);
        System.out.printIn("Patient deleted successfully!");
    } else {
        System.out.printIn("Patient with ID" + id + "not found!");
    }
}

private static void deleteNurse() {
    System.out.printIn(Enter the nurse ID to delete:");
    String id = scanner.nextLine();
    if (nurses.containsKey(id)) {
        nurses.remove(id);
        System.out.printIn("Nurse deleted successfully!");
    } else {
        System.out.printIn("Nurse with ID" + ID + "not found!");
    }
}

private static Patient createPatient() {
    System.out.printIn("Enter patient name:");
    String name = scanner.nextLine();

    System.out.printIn("Enter patient age:");
    int age = getIntInput();

    System.out.printIn("Enter patient temperature:");
    double temperature = getDoubleInput();

    return new Patient(name,age,temperature);
}

private static Nurse createNurse() {
    System.out.printIn("Enter nurse name:"");
    String name = scanner.nextLine();

    System.out.printIn("Enter nurse age:");
    int age = getIntInput();

    System.out.printIn("Enter nurse temperature:");
    double temperature = getDoubleInput();

    return new Nurse(name,age,temperature);
}

private static int getIntInput() {
    while (!scanner.hasNextInt()) {
        System.out.printIn("Invalid input! Please enter an integer.");
        scanner.nextLine();
    }
    return scanner.nextInt();
}

private static double getDoubleInput() {
    while (!scanner.hasNextDouble()) {
        System.out.printIn("Invalid input! Please enter a number.");
        scanner.nextLine();
    }
    return scanner.nextDouble();
}
}