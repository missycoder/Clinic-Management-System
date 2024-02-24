import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ClinicManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Patient> patients = new HashMap<>();
    private static Map<Integer, Nurse> nurses = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add a Patient");
            System.out.println("2. Add a Nurse");
            System.out.println("3. List Patients");
            System.out.println("4. List Nurses");
            System.out.println("5. Update a Patient");
            System.out.println("6. Update a Nurse");
            System.out.println("7. Delete a Patient");
            System.out.println("8. Delete a Nurse");
            System.out.println("9. Exit");

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
                    updatePatient();
                    break;
                case 6:
                    updateNurse();
                    break;
                case 7:
                    deletePatient();
                    break;
                case 8:
                    deleteNurse();
                    break;
                case 9:
                    System.out.println("Thank you for using the Clinic Management System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please choose a number between 1 and 9.");
            }
        }
    }

    private static int getIntInput() {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }

        return input;
    }

    private static double getDoubleInput() {
        double input = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        return input;
    }

    private static void addPatient() {
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter patient age:");
        int age = getIntInput();
        System.out.println("Enter patient temperature:");
        double temperature = getDoubleInput();
        System.out.println("Enter patient ID:");
        int id = getIntInput();

        Patient patient = new Patient(scanner, name, age, temperature, id);
        patients.put(patient.getId(), patient);
        System.out.println("Patient added successfully!");
    }

    private static void addNurse() {
        System.out.println("Enter nurse name:");
        String name = scanner.nextLine();
        System.out.println("Enter nurse age:");
        int age = getIntInput();
        System.out.println("Enter nurse temperature:");
        double temperature = getDoubleInput();
        System.out.println("Enter nurse ID:");
        int staffID = getIntInput();

        Nurse nurse = new Nurse(scanner, name, age, temperature, staffID);
        nurses.put(nurse.getStaffID(), nurse);
        System.out.println("Nurse added successfully!");
    }

    private static void listPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients.values()) {
            System.out.println(patient);
        }
    }

    private static void listNurses() {
        System.out.println("Nurses:");
        for (Nurse nurse : nurses.values()) {
            System.out.println(nurse);
        }
    }

    private static void updatePatient() {
        System.out.println("Enter the patient ID to update:");
        int id = getIntInput();
        if (patients.containsKey(id)) {
            Patient patient = patients.get(id);
            System.out.println("Enter updated patient name:");
            String name = scanner.nextLine();
            patient.setName(name);
            System.out.println("Enter updated patient age:");
            int age = getIntInput();
            patient.setAge(age);
            System.out.println("Enter updated patient temperature:");
            double temperature = getDoubleInput();
            patient.setTemperature(temperature);
            System.out.println("Patient updated successfully!");
        } else {
            System.out.println("Patient with ID " + id + " not found!");
        }
    }

    private static void updateNurse() {
        System.out.println("Enter the nurse ID to update:");
        int id = getIntInput();
        if (nurses.containsKey(id)) {
            Nurse nurse = nurses.get(id);
            System.out.println("Enter updated nurse name:");
            String name = scanner.nextLine();
            nurse.setName(name);
            System.out.println("Enter updated nurse age:");
            int age = getIntInput();
            nurse.setAge(age);
            System.out.println("Enter updated nurse temperature:");
            double temperature = getDoubleInput();
            nurse.setTemperature(temperature);
            System.out.println("Nurse updated successfully!");
        } else {
            System.out.println("Nurse with ID " + id + " not found!");
        }
    }

    private static void deletePatient() {
        System.out.println("Enter the patient ID to delete:");
        int id = getIntInput();
        if (patients.containsKey(id)) {
            patients.remove(id);
            System.out.println("Patient deleted successfully!");
        } else {
            System.out.println("Patient with ID " + id + " not found!");
        }
    }

    private static void deleteNurse() {
        System.out.println("Enter the nurse ID to delete:");
        int id = getIntInput();
        if (nurses.containsKey(id)) {
            nurses.remove(id);
            System.out.println("Nurse deleted successfully!");
        } else {
            System.out.println("Nurse with ID " + id + " not found!");
        }
    }
}
