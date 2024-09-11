package dayTimeServer;
import java.io.*;
import java.net.*;
import java.util.Date;

public class MTdaytimeServer {
    public static void main(String[] args) throws Exception {
        // Create a ServerSocket -port 1234
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server is running...");

        // Infinite loop to keep the server running
        while (true) {
            // Accept a new client connection
            Socket clientSocket = serverSocket.accept();
            // Create a new thread to handle the client
            new Thread(() -> {
                try {
                    // Send the current date and time to the client
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    out.println(new Date());
                    // Close the connection
                    clientSocket.close();
                  
                } catch (IOException e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}
