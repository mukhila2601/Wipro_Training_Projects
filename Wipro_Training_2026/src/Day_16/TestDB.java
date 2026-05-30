package Day_16;
//import java.sql.*;
//public class TestDB {
//	public static void main(String[] args) {
//        try {
//            Connection con = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/PreparedStatement", "root", "Noida@@12345");
//
//            System.out.println("Connected Successfully!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

import java.sql.*;

public class TestDB {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PreparedStatement",
                "root",
                "Noida@@12345"   
            );
            if (con != null) {
                System.out.println("✅ Connected Successfully!");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
