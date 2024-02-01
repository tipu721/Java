package oopMisc;

import java.util.Locale;

class Student{
    String name;
    Integer age;

    void changeObject(Student s) {
        s.name = s.name + " Sultan";
        s.age = s.age + 26;
    }

    void changeValue(String name, Integer age) {
        name = name.toLowerCase(Locale.ROOT);
        age = age.intValue() + 255;

    }
}

public class CallByValueAndRef {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tipu";
        s1.age = 25;
        System.out.println("Before call by object method: "+s1.name + " "+s1.age);
        s1.changeObject(s1);
        System.out.println("After call by object method: "+s1.name + " "+s1.age);
        s1.changeValue(s1.name, s1.age);
        System.out.println("After call by value method: "+s1.name + " "+s1.age);

    }



}
