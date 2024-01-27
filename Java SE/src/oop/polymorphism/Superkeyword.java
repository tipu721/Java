package oop.polymorphism;

class  Parent{
    String color = "White";
    void print(){
        System.out.println("parent class method");
    }

    Parent(){
        System.out.println("Parent object created");
    }

}
class Child extends Parent{

    String color = "White";
    void print(){
        System.out.println("child class method");
    }
    Child(){
       // System.out.println(super.a);
        System.out.println("Child object created");
       // super.print();
        this.print();
        super.print();

    }


}

public class Superkeyword {
    public static void main(String[] args) {
        Parent c1 = new Child();


    }

}
