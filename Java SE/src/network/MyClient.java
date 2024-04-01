package network;

import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage = "", serverMessage = "";

            while (!serverMessage.equals("Stop")){


               clientMessage = br.readLine();
               dout.writeUTF(clientMessage);
               dout.flush();

               serverMessage = din.readUTF();
               System.out.println("Server Message :"+serverMessage);

            }
            dout.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
