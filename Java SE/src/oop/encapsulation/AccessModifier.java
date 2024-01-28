package oop.encapsulation;


class A{
    public int publicData = 20; //accessable from anywhere
    private int privateData = 5; //only accessable inside class
    protected int protectedData = 100; // accessable from inherited class also can be different package
    int defaultData = 30; // accessable from any same pacage class

    void print(){
        System.out.println(" A class method called to check accesmodifier");
    }
    A(){

        System.out.println("A class constructor called");
    }



}

class B extends A{
    B(){
        System.out.println("B class constructor called");
    }

    @Override
    void print() {
        System.out.println("B class method called to check accesmodifier");
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        B b = new B();
        PackageTest packageTest = new PackageTest();


    }
}
