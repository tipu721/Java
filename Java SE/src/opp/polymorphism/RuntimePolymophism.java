package opp.polymorphism;

//data members are not override
class PA{

    Integer a = 10;
    void print(){
        System.out.println("Printed PA class method");

    }
    PA(){
        System.out.println("PA contructor called");
    }

}

class PB extends PA{
    Integer a = 20;
    void print(){
        System.out.println("Printed PB class method");
        System.out.println(a);
    }
    PB(){
        System.out.println("PB contructor called");
    }

}

public class RuntimePolymophism {

    public static void main(String[] args) {
        PB pb = new PB();
        System.out.println(pb.a);


    }

}
