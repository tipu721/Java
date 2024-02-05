package ObjectInOut;

import java.io.*;

public class ObjectInOut {


    public static void main(String[] args){
        Dog dog1 = new Dog("Dog1", "White");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Learning Phase\\ObjectInputOutput.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dog1);
            System.out.println("OK");



            FileInputStream fileInputStream = new FileInputStream("D:\\Learning Phase\\ObjectInputOutput.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Dog dog2 = (Dog) objectInputStream.readObject();
            System.out.println(dog2.toString());


        }
        catch (Exception e) {

            e.printStackTrace();

        }



    }

}

