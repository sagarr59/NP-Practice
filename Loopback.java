import java.net.*;
public class Loopback {
  public static void main(String[] args) {
    try{
      InetAddress loopback = InetAddress.getLoopbackAddress();
      System.out.println("LoopBack Address"+loopback.getHostAddress());
    }
  catch(Exception e){
    System.out.println(e);
  }
  }}
