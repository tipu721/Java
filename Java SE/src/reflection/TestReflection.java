package reflection;


class MyClass{

}

class MyInterface{

}

public class TestReflection {

    public static void main(String[] args) {

        try {
            System.out.println("Get class obj with Class.forname() method");
            Class c1 = Class.forName("reflection.Simple");
            System.out.println(c1.getName());
            System.out.println(c1.toString());
            System.out.println("Object Creation");
        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Get class obj with getClass() method");
        Simple simple = new Simple();
        Integer a = 10;
        System.out.println( simple.getClass().getName());
        System.out.println(a.getClass());



        System.out.println("Get class obj with Datatype.class");
        Class c2 = boolean.class;
        System.out.println(c2.getName());
        System.out.println(Class.class);

        System.out.println("Check interface , Array or premitives");
        System.out.println(c2.isInterface());
        System.out.println(c2.isArray());
        System.out.println(c2.isPrimitive());


        System.out.println("Object create with java reflection");
        try {
            Class class1 = Class.forName("reflection.Simple");
            Simple simple1 = (Simple) class1.newInstance();
            simple1.message();
        }

        catch (ClassNotFoundException  | IllegalAccessException | InstantiationException ex ) {
           ex.printStackTrace();
        }

    }
}
