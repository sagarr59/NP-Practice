package inetAddress;
import java.net.*;

public class IPandMAC {
    public static void main(String[] args) {
        try {
            // Get the IP address of the local host
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP address: " + ip.getHostAddress());

            // Get the network interface for the IP address
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            // Get the MAC address
            byte[] mac = network.getHardwareAddress();
            System.out.print("MAC address: ");
            for (int i = 0; i < mac.length; i++) {
                System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
