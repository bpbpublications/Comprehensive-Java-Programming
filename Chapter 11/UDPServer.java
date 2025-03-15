import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket to listen on port 9876
            DatagramSocket serverSocket = new DatagramSocket(9876);

            // Buffer to receive incoming data
            byte[] receiveBuffer = new byte[1024];

            System.out.println("Server is waiting for client messages...");

            // Infinite loop to keep the server running
            while (true) {
                // Create a packet to receive data
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                // Receive the data
                serverSocket.receive(receivePacket);

                // Extract the client's message and IP address
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received message from client: " + clientMessage);

                // Prepare the response message
                String responseMessage = "Hello from server!";
                byte[] responseBuffer = responseMessage.getBytes();

                // Send the response to the client
                DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length, clientAddress, clientPort);
                serverSocket.send(responsePacket);

                System.out.println("Response sent to client: " + responseMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

