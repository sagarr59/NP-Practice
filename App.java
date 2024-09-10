import java.io.*;
import java.net.*;

public class App {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL u = new URL("https://www.example.com");

            // Use InputStream to read byte by byte
            InputStream in = u.openStream();
            int c;
            System.out.println("Content retrieved from the URL:");

            // Read each byte and write to output
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }

            // Close the InputStream
            in.close();
        } catch (IOException ex) {
            // Handle IOExceptions (e.g., issues with connection or invalid URL)
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
