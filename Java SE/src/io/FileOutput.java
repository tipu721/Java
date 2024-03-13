package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutput {


    public static void main(String[] args) {


        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\Desktop\\test.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success...!");
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
