import java.net.HttpURLConnection;
import java.net.URL;

public class PrintHttpHeaders {
    public static void main(String[] args) {
        String urlString = "https://www.x.com"; // Replace with the URL you want to check

        try {
            // Create URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Print response code
            System.out.println("Response Code: " + connection.getResponseCode());

            // Print HTTP headers
            System.out.println("HTTP Headers:");
            for (int i = 0; ; i++) {
                String header = connection.getHeaderFieldKey(i);
                String value = connection.getHeaderField(i);
                if (header == null && value == null) break;
                if (header != null) {
                    System.out.println(header + ": " + value);
                }
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
