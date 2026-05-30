package Day_12;
import java.io.*;
public class BankingApp {
	 public static void saveTransaction(String data) {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("transactions.txt", true))) {
	            bw.write(data);
	            bw.newLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void readAccountDetails() {
	        try (BufferedReader br = new BufferedReader(new FileReader("account.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	        saveTransaction("Deposited: 5000");
	        readAccountDetails();
	    }
}
