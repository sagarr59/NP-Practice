package inetAddress;
import java.net.*;
public class IpAddress{
  public static void main(String[] args) {
    try{

      
      InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
      System.out.println(address.getHostName());

      System.out.println(address.getHostAddress());
    }
    catch(UnknownHostException e){
      System.err.println("Error"+e.getMessage());
    }

  }
}