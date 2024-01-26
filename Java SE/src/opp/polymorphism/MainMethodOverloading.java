package opp.polymorphism;

//overloading not possible for only return type
//class A{
//    int add (int a, int b){
//        return a+b;
//    }
//    double add (int a, int b){
//        return a+b;
//    }
//}

public class Overloading {

    public static void main(String arg) {
        System.out.println("Argument with String "+arg);

    }

    public static void main(String[] args) {
        System.out.println("Argument with String[] args");
        main("Tipu Sultan");

    }
}
