package network;

import java.net.HttpURLConnection;
import java.net.URL;

public class TestURL {

    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
           for(int i=0; i<8; i++){
               System.out.println(huc.getHeaderFieldKey(i)+"<->"+huc.getHeaderField(i));
           }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }


}
