package beffer;

import java.io.*;

public class Beffer
{

    public static void main(String[] args) throws IOException {

        String  data = "Texing Data for Buffer I/O";
        byte array[] = data.getBytes();
        FileOutputStream fileOutputStream= new FileOutputStream("D:\\Learning Phase\\buffer.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(array);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();



        FileInputStream fileInputStream = new FileInputStream("D:\\Learning Phase\\buffer.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i = bufferedInputStream.read();
        while (i != -1){
            System.out.print((char)i);
            i = bufferedInputStream.read();
        }

    }
}
