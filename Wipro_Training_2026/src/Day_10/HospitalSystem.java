package Day_10;

import java.util.*;
import java.util.TreeSet;

public class HospitalSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> patientIDs = new TreeSet<>();

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
                  //dup
                    if (patientIDs.contains(id)) {
                        System.out.println("❌ Patient already registered!");
                    } else {
                        patientIDs.add(id);
                        System.out.println("✅ Patient added successfully!");
                    }
                    break;
                case 2:
                    System.out.println("📋 Registered Patients (Unique IDs):");
                    for (int pid : patientIDs) {
                        System.out.println(pid);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
