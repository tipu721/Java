package opp.abstraction;

abstract class A{
    abstract void printAbstract();
    int data = 25; //non abastract data member
    static int staticData = 36;  // static data
    static void printStatic(){
        System.out.println("Static method printed");
    }
    void printNonAbstract(){
        System.out.println("non abstract method in abstract class");
    }
    // abstract int AbstractData = 36; variable can not be abstract
}

public class TestAbstract extends A {

    @Override
    void printAbstract() {
        System.out.println("abstract method implemented");
    }



    public static void main(String[] args) {

        TestAbstract obj1 = new TestAbstract();

        System.out.println(obj1.data);
        obj1.printAbstract();
        obj1.printNonAbstract();

        printStatic();
        System.out.println(staticData);


    }

}
