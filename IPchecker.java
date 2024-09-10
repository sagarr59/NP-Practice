import java.net.*;
public class IPchecker {
  public static void main(String[] args) {
    String ip="192.168.1.1";
    try {
      InetAddress inet= InetAddress.getByName(ip);
      byte[]addr = inet.getAddress();
      if(addr.length==4){
        System.out.println(ip+"is IPV4");
      }else if(addr.length==16){
        System.out.println(ip+"is IPV6");

      }else{
        System.out.println("Invalid IP");
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
