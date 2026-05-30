package Day_12;
import java.io.*;
public class FoodDeliveryApp {
    public static void main(String[] args) {
        String file = "orders.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("OrderID: 201 | Pizza | Delivered\n");
            bw.write("OrderID: 202 | Burger | Pending\n");
            System.out.println("Order stored.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nDelivery Logs:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
