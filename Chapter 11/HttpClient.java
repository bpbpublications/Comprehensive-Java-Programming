import java.io.*;
import java.net.*;

public class HttpClient {
    public static void main(String[] args) {
        String host = "www.example.com"; // Change this to the host you want to connect to
        int port = 80; // HTTP default port
        
        try (Socket socket = new Socket(host, port)) {
            // Send HTTP GET request
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("GET / HTTP/1.1");
            out.println("Host: " + host);
            out.println("User-Agent: JavaHttpClient");
            out.println("Connection: close");
            out.println(); // Blank line to indicate end of headers

            // Read response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

