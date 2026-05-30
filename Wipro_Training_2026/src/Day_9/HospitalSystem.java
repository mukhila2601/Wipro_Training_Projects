package Day_9;

import java.util.*;

public class HospitalSystem {
	private Set<Integer> patientIds;
    public HospitalSystem() {
        patientIds = new HashSet<>();
    }
    public void registerPatient(int id) {
        if (patientIds.contains(id)) {
            System.out.println("ID " + id + " is already registered.");
        } else {
            patientIds.add(id);
            System.out.println("Patient with ID " + id + " added to the system.");
        }
    }
    public void viewPatients() {
        if (patientIds.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("List of registered patient IDs:");
            for (int id : patientIds) {
                System.out.println(id);
            }
        }
    }
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    system.registerPatient(id);
                    break;
                case 2:
                    system.viewPatients();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
