package oop;

// this use to point current object
class A{
    int a = 10;
    void n(){
        System.out.println("n called");
    }
    void m(A a){
        System.out.println("m called");
        a.n();
        this.n();
    }
    A(){
        System.out.println(this);
    }
}

//this constructor with parameter
class B{

    B(){
        this(20);
        System.out.println("class B called");
       // this(20); must be 1st statement of constructor

    }
    B(int x){
        System.out.println("B class called with "+x);
    }
}

//this: to pass as argument in the constructor call
class C{

    C(C c){

        System.out.println("constructor called with parameter");

    }

    C(){
        C c = new C(this);
    }

    C getC(){
       return this;
    }

}
public class ThisKeyword {


    public static void main(String[] args) {

        //this point current class object
        A a = new A();
        a.n();
        //this to use currten class constructor
        B b = new B();

        //this: to pass as argument in the constructor call
        C c = new C();

        //return as a statement from the method

        System.out.println("1: "+ c);
        System.out.println(c.getC());




    }
}
