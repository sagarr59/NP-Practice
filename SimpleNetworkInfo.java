import java.net.*;
import java.util.Enumeration;

public class SimpleNetworkInfo {
    public static void main(String[] args) {
        try {
            // Get the network interfaces
            Enumeration<NetworkInterface> nics = NetworkInterface.getNetworkInterfaces();
            
            while (nics.hasMoreElements()) {
                NetworkInterface nic = nics.nextElement();
                
                // Get and print MAC address
                byte[] mac = nic.getHardwareAddress();
                if (mac != null) {
                    StringBuilder macAddress = new StringBuilder();
                    for (byte b : mac) {
                        if (macAddress.length() > 0) macAddress.append("-");
                        macAddress.append(String.format("%02X", b));
                    }
                    System.out.println("MAC Address: " + macAddress);
                }
                
                // Get and print IP addresses
                Enumeration<InetAddress> addresses = nic.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    System.out.println("IP Address: " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
