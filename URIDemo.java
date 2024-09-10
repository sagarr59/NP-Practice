import java.net.URI;
import java.net.URISyntaxException;

public class URIDemo {
    public static void main(String[] args) {
        try {
            // Create a base URI
            URI baseUri = new URI("http://www.example.com/path/");

            // Create a relative URI
            URI relativeUri = new URI("newpath/resource.html");

            // Resolve the relative URI against the base URI
            URI resolvedUri = baseUri.resolve(relativeUri);

            // Output the URIs
            System.out.println("Base URI: " + baseUri);
            System.out.println("Relative URI: " + relativeUri);
            System.out.println("Resolved URI: " + resolvedUri);

        } catch (URISyntaxException e) {
            System.err.println("Invalid URI syntax: " + e);
        }
    }
}
