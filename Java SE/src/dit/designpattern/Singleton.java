package designpattern;


class A {

    String name;
    Integer age;
    static private A obj;

    private A() {

    }

    public static synchronized A getObj() {

        if (obj == null) {
            obj = new A();
            System.out.println("Object created");
        }

        return obj;

    }

}

public class Singleton {
    public static void main(String[] args) {


        Thread t1 = new Thread() {
            @Override
            public void run() {
                A obj1 = A.getObj();

            }
        };

        Thread t2 = new Thread() {

            @Override
            public void run() {
                A obj2 = A.getObj();
            }

        };

        t1.start();
        t2.start();

    }
}
