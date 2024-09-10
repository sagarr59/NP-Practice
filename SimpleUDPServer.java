import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SimpleUDPServer {
    public static void main(String[] args) {
        int port = 9876; // Port number for the server

        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("UDP Server is running on port " + port);

            byte[] buffer = new byte[1024]; // Buffer for incoming data

            while (true) {
                // Receive a packet from the client
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                // Convert received data to string
                String message = new String(packet.getData(), 0, packet.getLength());

                // Print received message
                System.out.println("Received message: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
