import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobInsertExample {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        FileInputStream fileInputStream = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdatabase", "username", "password");

            // Specify the file to be inserted
            File imageFile = new File("C:/Image.jpg");
            fileInputStream = new FileInputStream(imageFile);

            // Prepare the SQL statement
            String sql = "INSERT INTO blobtest (pic_name, pic_file) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, imageFile.getName());
            preparedStatement.setBinaryStream(2, fileInputStream, (int) imageFile.length());

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
                if (fileInputStream != null) fileInputStream.close();
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
