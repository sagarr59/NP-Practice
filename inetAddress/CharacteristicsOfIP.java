package inetAddress;

import java.net.*;

public class CharacteristicsOfIP {
  public static void main(String[] args) {
  try {
    InetAddress inet = InetAddress.getByName("127.0.0.1");

    System.out.println(inet.getHostAddress());
    System.out.println(inet.isReachable(200));
    System.out.println(inet.isLoopbackAddress());
    System.out.println(inet.isMulticastAddress());

  } catch (Exception e) {
    System.out.println(e);
  }
  }
}
