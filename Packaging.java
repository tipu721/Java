class A{
    A(){
        System.out.println("A class contstructor called");
    }
}
class B extends A{
    B(){
        System.out.println("B class constructor called");
    }
}
class Packaging {
    public static void main(String[] args) {
        B b = new B();

    }
    
}