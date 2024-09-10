import java.io.*;
import java.net.*;
public class FetchWithURLConnection {
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder();
    try {
      @SuppressWarnings("deprecation")
      URL url= new URL("https://www.example.com");
      URLConnection uc= url.openConnection();
      InputStream in= uc.getInputStream();
      BufferedReader br= new BufferedReader(new InputStreamReader(in));

      String line;
      while((line=br.readLine())!=null){
          sb.append(line+"\n");
      }
      System.out.println(sb.toString());
      
      br.close();


    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
