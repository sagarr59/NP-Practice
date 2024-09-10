import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer{
  public static void main(String[] args) throws Exception {
    //create serversocket
    ServerSocket serverSocket = new ServerSocket(1234);
    //wait for client to connect
    Socket clientSocket= serverSocket.accept();
    System.out.println("Client connected");
//current date and time
    String currentDateTime= new Date().toString();
    //send data to client
    PrintWriter out= new PrintWriter(clientSocket.getOutputStream());
    out.println(currentDateTime);
    clientSocket.close();
    serverSocket.close();

  }
}