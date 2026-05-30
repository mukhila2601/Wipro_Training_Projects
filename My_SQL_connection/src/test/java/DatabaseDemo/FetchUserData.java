package DatabaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchUserData {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/LoginDB";
		String dbUsername = "root";
		String dbPassword = "Noida@@12345";

		try {
			Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM users");

			while (rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");

				System.out.println("ID: " + id);
				System.out.println("Username: " + username);
				System.out.println("Password: " + password);
				System.out.println("----------------------");
			}

			con.close();
		} 
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}