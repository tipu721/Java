package FileReaderWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Learning Phase\\FileWriterReader.txt");
        String outData = "String for File Writer & Reader";
        fileWriter.write(outData);
        fileWriter.close();

        FileReader fileReader = new FileReader("D:\\Learning Phase\\FileWriterReader.txt");

        char[] inData = new char[100];

        fileReader.read(inData);
        System.out.println(inData);

    }
}
