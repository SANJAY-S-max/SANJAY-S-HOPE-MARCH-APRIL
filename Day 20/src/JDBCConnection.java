import java.sql.*;


public class JDBCConnection {

    public static void main(String[] args) {
        try {
            final String URL = "jdbc:mysql://localhost:3306/studentdb";
            final String USERNAME = "root";
            final String PASSWORD = "Thilagasanjay";
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established successfully!");
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}