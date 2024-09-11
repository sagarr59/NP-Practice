package URLandURI;
import java.net.*;

public class UrlEquals {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        // Correctly formatted URLs with protocol
        URL url1 = new URL("http://www.facebook.com");
        URL url2 = new URL("http://m.facebook.com");

        // Check if the URLs are equal
        if (url1.equals(url2)) {
            System.out.println(url1 + " and " + url2 + " are the same");
        } else {
            System.out.println(url1 + " and " + url2 + " are different");
        }
    }
}
