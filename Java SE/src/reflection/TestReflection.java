package reflection;

public class TestReflection {

    public static void main(String[] args) {

        try {
            System.out.println("Get class obj with Class.forname() method");
            Class c1 = Class.forName("reflection.Simple");
            System.out.println(c1.getName());
            System.out.println(c1.toString());
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






    }
}
