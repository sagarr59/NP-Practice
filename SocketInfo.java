import java.net.Socket;

public class SocketInfo {
    public static void main(String[] args) {
        String host = "www.example.com"; // Target host
        int port = 80;                   // Target port

        try (Socket socket = new Socket(host, port)) {
            // Display remote address and port
            System.out.println("Remote Address: " + socket.getInetAddress());
            System.out.println("Remote Port: " + socket.getPort());

            // Display local address and port
            System.out.println("Local Address: " + socket.getLocalAddress());
            System.out.println("Local Port: " + socket.getLocalPort());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
