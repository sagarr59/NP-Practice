import java.io.*;
import java.net.*;
import java.util.Date;
public class MyServer{
  public static void main(String[] args) throws Exception {
    //create serversocket
    ServerSocket serverSocket = new ServerSocket(1234);
    System.out.println("Server is running...");

    //wait for client to connect
    Socket clientSocket= serverSocket.accept();
    System.out.println("Client connected");
  
    //send data to client
    PrintWriter out= new PrintWriter(clientSocket.getOutputStream(),true);
    out.println(new Date().toString());
    clientSocket.close();
    serverSocket.close();

  }
}