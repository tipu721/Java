package serialization;

import io.FileOutput;
import org.omg.CORBA.Object;

import java.io.*;
import java.sql.SQLOutput;

class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationTest {


    public static void main(String[] args) {

        Student s1 = new Student(211, "Rizvi");
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\Desktop\\serialization.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\serialization.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 =(Student) in.readObject();
            System.out.println(s2.id+" "+s2.name);
            System.out.println("Input Success");
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
