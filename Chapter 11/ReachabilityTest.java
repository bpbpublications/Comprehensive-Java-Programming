import java.net.*;
public class ReachabilityTest {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.oracle.com");
            boolean reachable = address.isReachable(5000);  // Timeout in milliseconds
            System.out.println("Is www.oracle.com reachable? " + reachable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
