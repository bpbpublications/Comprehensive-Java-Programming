import java.io.*;
import java.net.*;
public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080");
            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            // Get input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            // Read a message from the client and send a response
            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);
            out.println("Hello, client! You sent: " + clientMessage);
            // Close the client socket
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
