package oop;

public class StaticBlock {

    static void print(){
        System.out.println("Static method printed");
    }

    static {
        System.out.println("Static block printed");
        print();

    }

    public static void main(String[] args) {

    }
}
