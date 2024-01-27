package opp.polymorphism;


class A1{
    A1(){
        System.out.println("A1 object created");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("B1 object created");
    }
}

public class InstanceOfKeyword {

    public static void main(String[] args) {
        A1 a1 = new A1();
       if(a1 instanceof A1){
           B1 b1 = (B1) a1;
       }
    }


}
