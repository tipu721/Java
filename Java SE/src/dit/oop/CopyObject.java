package oop;

import java.util.Stack;

public class CopyObject implements  Cloneable{

    Integer age;
    String name;
    CopyObject(String name, Integer age){
        this.name = name;
        this.age = age;

    }


    public static void main(String[] args) throws CloneNotSupportedException {

        CopyObject obj1 = new CopyObject("Tipu", 25);
        CopyObject obj2 = (CopyObject)obj1.clone();

        System.out.println(obj1.name + " "+ obj1.age);
        System.out.println(obj2.name + " "+ obj2.age);


        Stack<Integer>myStack = new Stack<>();



    }
}
