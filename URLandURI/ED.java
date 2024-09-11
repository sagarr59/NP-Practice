package URLandURI;
import java.io.*;
import java.net.*;

public class ED {
    public static void main(String[] args) {
        try {
            // Original URL
            String originalUrl = "https://github.com";

            // Encode the URL
            String encodedUrl = URLEncoder.encode(originalUrl, "UTF-8");
            System.out.println("Encoded URL: " + encodedUrl);

            // Decode the URL
            String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
            System.out.println("Decoded URL: " + decodedUrl);

        } catch (UnsupportedEncodingException e) {
            System.err.println("Encoding/decoding error: " + e.getMessage());
        }
    }
}
