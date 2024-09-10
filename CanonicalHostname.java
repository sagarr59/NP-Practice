
import java.net.InetAddress;

public class CanonicalHostname {
  public static void main(String[] args) {
    try {
      InetAddress cHostname= InetAddress.getByName("8.8.8.8");
      System.out.println("CanonicalHostName: "+cHostname.getCanonicalHostName());  
      


    } catch (Exception e) {

      System.out.println(e);
    }
  }
  
}
