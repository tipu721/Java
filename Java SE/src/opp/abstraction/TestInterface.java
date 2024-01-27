package opp.abstraction;
interface InA{
    void print(); // by default public abstract method
    default void defaultPrint(){
        System.out.println("default method printed"); // allows default method
    }
    static void staticPrint(){
        System.out.println("static method printed"); // allows static method but by default final
    }
    int data = 25; // public static final by default
}


class  ImA implements InA{
    @Override //overridden method can be change to lower access modifier
    public void print() {
        System.out.println("abstract method implemented");
    }
}

public class TestInterface{

    public static void main(String[] args) {

        ImA obj1 = new ImA();
        obj1.print();
        obj1.defaultPrint();
     //   ImA.data += 3; //final value can not change
        InA.staticPrint();


    }

}
