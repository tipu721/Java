package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 6666);
        System.out.println("Client Socket Created");
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Server");
        dout.flush();
        dout.close();
        s.close();
    }
}
