import java.net.Socket;
public class PortScanner {
    public static void main(String[] args) {
        String targetHost = "127.0.0.1"; // The IP address or hostname of the target machine
        int startPort = 1; // Starting port number
        int endPort = 1024; // Ending port number
        System.out.println("Scanning ports on host: " + targetHost);
        
        for (int port = startPort; port <= endPort; port++) {
            try {
                // Try to establish a socket connection to the given host and port
                Socket socket = new Socket(targetHost, port);
                System.out.println("Port " + port + " is open.");
                socket.close(); // Close the socket after successful connection
            } catch (Exception e) {
                // If connection fails, the port is closed or unreachable
                // Optionally print the closed ports by uncommenting the next line
                // System.out.println("Port " + port + " is closed.");
            }
        }
        
        System.out.println("Port scanning complete.");
    }
}
