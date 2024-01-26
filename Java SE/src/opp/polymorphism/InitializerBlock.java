package opp.polymorphism;

class Parent1{

    Parent1(){
        System.out.println("Parent objetct created");
    }

}
class Child1 extends Parent1{
    Child1(){
        System.out.println("Child object created");
    }
    {
        System.out.println("Intializer block invocked");
    }
}

public class InitializerBlock {
    public static void main(String[] args) {
        Child1 child = new Child1();
    }
}
