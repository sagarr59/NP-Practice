package dayTimeServer;
import java.io.*;
import java.net.*;
public class MTdaytimeClient {
    public static void main(String[] args) throws IOException {
        // Create a socket to connect to the server
        Socket clientSocket = new Socket("localhost", 1234);
        // Create input stream to read data from the server
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        // Read data from the server
        String serverResponse = in.readLine();
        System.out.println("Server says: " + serverResponse);


        // Close the connection
        clientSocket.close();
    }
    
}


