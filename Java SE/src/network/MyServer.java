package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            String clientMessage = "", serverMessage = "";


            while(!clientMessage.equals("Stop")){
                clientMessage = din.readUTF();
                System.out.println("Client Message: "+clientMessage);
                serverMessage = br.readLine();
                dout.writeUTF(serverMessage);
                dout.flush();

            }
            dout.close();
            s.close();

        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
