package network;

import java.net.InetAddress;

public class InetDemo {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.javatpoint.com");
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
        }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
