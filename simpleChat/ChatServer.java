package simpleChat;
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server started...");
        Socket s = ss.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String msgFromClient, msgToClient;

        while (true) {
            msgFromClient = in.readLine();
            System.out.println("Client: " + msgFromClient);
            System.out.print("You: ");
            msgToClient = userInput.readLine();
            out.println(msgToClient);
        }
    }
}
