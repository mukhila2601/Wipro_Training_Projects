package Day_12;
import java.io.*;
public class HospitalApp {
	public static void main(String[] args) {
        String file = "patients.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Patient: Rahul | Age: 25 | Disease: Flu\n");
            bw.write("Patient: Anita | Age: 30 | Disease: Fever\n");
            System.out.println("Patient records saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Generate report
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nMedical Report:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
