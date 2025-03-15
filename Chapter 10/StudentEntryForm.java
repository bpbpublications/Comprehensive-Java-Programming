import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentEntryForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Data Entry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create form labels and fields
        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageLabel);
        frame.add(ageField);

        frame.add(new JLabel()); // Empty cell for alignment
        frame.add(submitButton);

        // Define the action for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idStr = idField.getText();
                String name = nameField.getText();
                String ageStr = ageField.getText();

                // Basic validation
                if (idStr.isEmpty() || name.isEmpty() || ageStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    int id = Integer.parseInt(idStr);
                    int age = Integer.parseInt(ageStr);

                    // JDBC connection details
                    String url = "jdbc:mysql://localhost:3306/studentdb";
                    String user = "root"; // Replace with your MySQL username
                    String password = "password"; // Replace with your MySQL password

                    // Establish the connection
                    Connection connection = DriverManager.getConnection(url, user, password);

                    // Prepare the SQL statement
                    String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1, id);
                    preparedStatement.setString(2, name);
                    preparedStatement.setInt(3, age);

                    // Execute the update
                    int rowsAffected = preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(frame, "Student data submitted successfully.\nRows affected: " + rowsAffected, "Submission Successful", JOptionPane.INFORMATION_MESSAGE);

                    // Close resources
                    preparedStatement.close();
                    connection.close();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "ID and Age must be numeric.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Database error occurred.", "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }
}
