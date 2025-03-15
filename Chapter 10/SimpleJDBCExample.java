import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        // SQL statements
        String insertSQL = "INSERT INTO employees (name, role) VALUES ('Alice', 'Engineer')";
        String selectSQL = "SELECT id, name, role FROM employees";

        // Establishing a connection
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Inserting a record
            int rowsInserted = stmt.executeUpdate(insertSQL);
            System.out.println("Rows inserted: " + rowsInserted);

            // Retrieving and displaying records
            ResultSet rs = stmt.executeQuery(selectSQL);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                System.out.println("ID: " + id + ", Name: " + name + ", Role: " + role);
            }
            
            // Closing the ResultSet
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

