package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class MyServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Server Socket Created");
        Socket s = ss.accept();
        System.out.println("Connected");
        DataInputStream din = new DataInputStream(s.getInputStream());
        String sdata = din.readUTF();

        System.out.println(sdata);
        ss.close();


    }
}
