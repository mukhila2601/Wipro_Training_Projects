package Day_16;
import java.sql.*;
import java.util.Scanner;
public class EmployeeCRUD {
	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/PreparedStatement";
        String user = "root";
        String password = "Noida@@12345";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            while (true) {
                System.out.println("\n===== EMPLOYEE CRUD MENU =====");
                System.out.println("1. Insert Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                switch (choice) {
                    //CREATE
                    case 1:
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter department: ");
                        String dept = sc.next();
                        System.out.print("Enter salary: ");
                        int salary = sc.nextInt();
                        String insert = "INSERT INTO Employees (name, department, salary) VALUES (?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insert);
                        ps1.setString(1, name);
                        ps1.setString(2, dept);
                        ps1.setInt(3, salary);
                        ps1.executeUpdate();
                        System.out.println("Employee inserted successfully!");
                        break;
                    //READ
                    case 2:
                        String select = "SELECT * FROM Employees";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(select);
                        System.out.println("\nID | Name | Department | Salary");
                        while (rs.next()) {
                            System.out.println(
                                rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("department") + " | " +
                                rs.getInt("salary")
                            );
                        }
                        break;
                    //UPDATE
                    case 3:
                        System.out.print("Enter employee ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter new salary: ");
                        int newSalary = sc.nextInt();
                        String update = "UPDATE Employees SET salary = ? WHERE id = ?";
                        PreparedStatement ps2 = con.prepareStatement(update);
                        ps2.setInt(1, newSalary);
                        ps2.setInt(2, id);
                        ps2.executeUpdate();
                        System.out.println("Salary updated successfully!");
                        break;
                    //DELETE
                    case 4:
                        System.out.print("Enter employee ID: ");
                        int delId = sc.nextInt();
                        String delete = "DELETE FROM Employees WHERE id = ?";
                        PreparedStatement ps3 = con.prepareStatement(delete);
                        ps3.setInt(1, delId);
                        ps3.executeUpdate();
                        System.out.println("Employee deleted successfully!");
                        break;
                    //EXIT
                    case 5:
                        con.close();
                        System.out.println("Exited successfully!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
