package echoServer;
import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server running...");
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String msg;
        while (true) {               // Simple loop
            msg = in.readLine();      // Read from client
            out.println(msg);         // Echo back
            System.out.println("Client: " + msg);  // Show client's message
        }
    }
}
