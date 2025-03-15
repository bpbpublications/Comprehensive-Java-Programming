import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class CallableStatementExample {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        // JDBC objects
        Connection conn = null;
        CallableStatement cstmt = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);

            // Prepare the CallableStatement for the stored procedure
            cstmt = conn.prepareCall("{call GetEmployeeBonus(?, ?, ?)}");

            // Set the input parameter (employee ID)
            cstmt.setInt(1, 101);

            // Register the output parameters
            cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            cstmt.registerOutParameter(3, java.sql.Types.DOUBLE);

            // Execute the stored procedure
            cstmt.execute();

            // Retrieve the output parameters
            String empName = cstmt.getString(2);
            double bonus = cstmt.getDouble(3);

            // Display the result
            System.out.println("Employee Name: " + empName);
            System.out.println("Calculated Bonus: $" + bonus);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
