import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        // SQL query with placeholders for inserting data
        String insertSQL = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        String selectSQL = "SELECT id, username, email FROM users";

        try (
            // Establish the database connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create the PreparedStatement for inserting data
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            // Create the PreparedStatement for selecting data
            PreparedStatement selectPstmt = conn.prepareStatement(selectSQL)
        ) {
            // Insert first user
            pstmt.setString(1, "john_doe");
            pstmt.setString(2, "john@example.com");
            pstmt.setString(3, "securepassword");
            pstmt.executeUpdate();

            // Insert second user
            pstmt.setString(1, "jane_smith");
            pstmt.setString(2, "jane@example.com");
            pstmt.setString(3, "anothersecurepassword");
            pstmt.executeUpdate();

            // Execute the SELECT statement to retrieve data
            ResultSet rs = selectPstmt.executeQuery();

            // Display the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email);
            }

            // Close the ResultSet
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

