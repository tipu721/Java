package io;

import java.io.IOException;

public class TestIO1 {

    public static void main(String[] args) {

        int i = 0;
        try {
            i = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((char)i);
    }
}
