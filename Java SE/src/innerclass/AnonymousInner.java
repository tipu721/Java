package innerclass;
class Person{

    void eat(){
        System.out.println("Person eat");
    }
    void go(){
        System.out.println("Person go to dhaka");
    }

}

interface Eataable{
    void eat();
    void got();
}

public class AnonymousInner {

    public static void main(String[] args) {

        //anonymous inner class using class
        Person p1 = new Person(){
            @Override
            void eat() {
                System.out.println("Eat in inner class");
            }
            void innerclassMethod(){
                System.out.println("Anonymous Inner class method called");
            }
        };
        p1.go();
        p1.eat();


        //anonymous inner class using interface
        Eataable e = new Eataable() {
            @Override
            public void eat() {
                System.out.println("Eating inside inner interface");
            }

            @Override
            public void got() {

            }
        };
        e.eat();


    }
}
