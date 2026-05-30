package Day_10;

import java.util.TreeSet;

public class Q2_treeSet {
	public static void main(String[] args) {
		TreeSet<Integer> patients = new TreeSet<>();
        int[] incomingPatients = {101, 102, 103, 101, 104, 102};

        for (int id : incomingPatients) {

            if (patients.contains(id)) {
                System.out.println("ID " + id + " already registered");
            } 
            else {
                patients.add(id);
                System.out.println("Patient with ID " + id + " added to system");
            }
        }

        System.out.println("List of unique registered patients:");
        for (int id : patients) {
            System.out.println(id);
        }
	}
}
