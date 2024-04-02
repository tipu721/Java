package dit.FileInOut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {


    public static void main(String[] args) throws IOException {


        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Learning Phase\\file1.txt");


        String s1 = "We Love Java T Point";
        byte b[] = s1.getBytes();

        fileOutputStream.write(b);
        fileOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("D:\\Learning Phase\\file1.txt");


        byte c[] = new byte[100];
        fileInputStream.read(c);
        String s2 = new String(c);

        System.out.println(s2);








    }
}
