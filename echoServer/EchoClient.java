package echoServer;
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
          System.out.print("You: ");
            out.println(userIn.readLine());        // Send user input
            System.out.println("Server: " + in.readLine());  // Print server's echoed message
        }
    }
}
