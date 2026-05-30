package Day_16;
import java.sql.*;
public class DepartmentWiseFetch {
	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/PreparedStatement";
        String user = "root";
        String password = "Noida@@12345";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM Employees ORDER BY department";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getInt("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
