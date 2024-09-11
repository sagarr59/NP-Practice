package simpleChat;
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String msgFromServer, msgToServer;

        while (true) {
            System.out.print("You: ");
            msgToServer = userInput.readLine();
            out.println(msgToServer);
            msgFromServer = in.readLine();
            System.out.println("Server: " + msgFromServer);
        }
    }
}
