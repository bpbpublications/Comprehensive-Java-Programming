import java.net.*;
import java.io.*;
public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();
            // Set request headers
            connection.setRequestProperty("User-Agent", "MyApp");
            // Connect to the URL
            connection.connect();
            // Read response headers
            System.out.println("Content-Type: " + connection.getHeaderField("Content-Type"));
            System.out.println("Date: " + connection.getHeaderField("Date"));
            System.out.println("Server: " + connection.getHeaderField("Server"));
            // Read content from the URL
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
