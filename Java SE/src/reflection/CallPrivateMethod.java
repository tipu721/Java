package reflection;

import java.lang.reflect.Method;

class A{
    private A(){
        System.out.println("Private constructor called");
    }
    private void message(){
        System.out.println("Hello Java");
    }
    public void print(){
        System.out.println("Print public method");
    }
}


public class CallPrivateMethod {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("reflection.A");
        A a =(A) c.newInstance();
        Method m = c.getDeclaredMethod("message", null);
        Method m1 = c.getDeclaredMethod("A", null);

        m.setAccessible(true);
        m.invoke(a, null);
        m1.setAccessible(true);
        m1.invoke(a, null);
        a.print();



    }
}
