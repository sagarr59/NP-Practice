package inetAddress;
import java.net.*;
public class LocalHost {
  public static void main(String[] args) throws Exception {
    InetAddress localhost= InetAddress.getLocalHost();
    System.out.println("LocalHost: "+localhost.getHostName());
    System.out.println("LocalHost: "+localhost.getHostAddress());


  }
  
}
