package URLandURI;

import java.net.*;
public class UrlComponents{
  public static void main(String[] args) throws Exception {
    @SuppressWarnings("deprecation")
    URL url = new URL("https://sagar@www.google.com:123/images/?key1=value1#sagar");
    System.out.println("Given URL: "+url.toString());
    System.out.println("Given URL: "+url.toExternalForm());
    System.out.println("Given URL: "+url.toURI());
    System.out.println("--Components of this url--");
    System.out.println("Protocol: "+url.getProtocol());
    System.out.println("User Info: "+url.getUserInfo());
    System.out.println("Host: "+url.getHost());
    System.out.println("Port of protocol: "+url.getDefaultPort());
    System.out.println("Port: "+url.getPort());
    System.out.println("Authority: "+url.getAuthority());
    System.out.println("File: "+url.getFile());
    System.out.println("Path: "+url.getPath());
    System.out.println("Query: "+url.getQuery());
    // System.out.println("Content: "+url.getContent());
   System.out.println("Fragment: "+url.getRef());
  }
}