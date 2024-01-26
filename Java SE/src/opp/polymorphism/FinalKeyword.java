package opp.polymorphism;

final class C{ //can not inherite final class

}


class A{
    final Integer a = 10;
    Integer b = 20;
    final void print(){
        //a = 20; final variable can not changed
        System.out.println("print method of class A");
    }
}
class B extends A{
    //void print() final method can not override
    Integer b = 30;
}

public class FinalKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
