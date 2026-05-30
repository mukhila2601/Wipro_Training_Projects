package Day_12;
import java.io.*;
class Employee implements Serializable {
 int id;
 String name;
 double salary;
 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}
public class EmployeeApp {
 public static void main(String[] args) {
     String file = "employee.dat";
     Employee emp = new Employee(1, "Ravi", 50000);
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
         oos.writeObject(emp);
         System.out.println("Employee saved.");
     } catch (IOException e) {
         e.printStackTrace();
     }
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
         Employee e = (Employee) ois.readObject();
         System.out.println("\nEmployee Details:");
         System.out.println("ID: " + e.id);
         System.out.println("Name: " + e.name);
         System.out.println("Salary: " + e.salary);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}