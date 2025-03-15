import java.sql.*;

public class ClobUpdateExample {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement selectStmt = null;
        PreparedStatement updateStmt = null;
        ResultSet resultSet = null;
        Clob notesClob = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdatabase", "username", "password");

            // Retrieve the CLOB data
            String selectSQL = "SELECT NOTES FROM your_table WHERE some_condition";
            selectStmt = connection.prepareStatement(selectSQL);
            resultSet = selectStmt.executeQuery();
            
            if (resultSet.next()) {
                notesClob = resultSet.getClob("NOTES");
            }

            // Update the COMMENTS column using the retrieved CLOB
            String updateSQL = "UPDATE MARKETS SET COMMENTS = ? WHERE SALES < 1000000";
            updateStmt = connection.prepareStatement(updateSQL);
            if (notesClob != null) {
                updateStmt.setClob(1, notesClob);
                int rowsAffected = updateStmt.executeUpdate();
                System.out.println("Rows updated: " + rowsAffected);
            } else {
                System.out.println("No CLOB data found to update.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (selectStmt != null) selectStmt.close();
                if (updateStmt != null) updateStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
