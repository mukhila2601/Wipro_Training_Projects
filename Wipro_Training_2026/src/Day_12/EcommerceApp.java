package Day_12;
import java.io.*;
public class EcommerceApp {
	public static void saveOrder(String order) {
        try (FileWriter fw = new FileWriter("orders.txt", true)) {
            fw.write(order + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveInvoice(String invoice) {
        try (FileWriter fw = new FileWriter("invoices.txt", true)) {
            fw.write(invoice + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveShipping(String details) {
        try (FileWriter fw = new FileWriter("shipping.txt", true)) {
            fw.write(details + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        saveOrder("OrderID:101 Product:Laptop");
        saveInvoice("InvoiceID:500 Amount:70000");
        saveShipping("Address: Delhi, India");
    }
}
