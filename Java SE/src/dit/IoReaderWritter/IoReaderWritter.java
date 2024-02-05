package IoReaderWritter;

import java.io.*;

public class IoReaderWritter {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Learning Phase\\IoReaderWriter.txt");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        String inData = "IO Stream Writer Reader takes Character Array";

        outputStreamWriter.write(inData);
        outputStreamWriter.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\Learning Phase\\IoReaderWriter.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        char[] outData = new char[100];
        inputStreamReader.read(outData);

        System.out.println(outData);



    }




}
