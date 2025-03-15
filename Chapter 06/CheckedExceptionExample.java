import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
    // Declares that it throws IOException, a checked exception
    static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        // Reading file operations
        file.close();
    }
}
