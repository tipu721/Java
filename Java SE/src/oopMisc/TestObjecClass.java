package oopMisc;

import operators.Operator;

public class TestObjecClass {

    public static void main(String[] args) {
        Operator operator = new Operator();
        Object obj1 = operator.getObject();
        System.out.println(obj1.getClass().getName());
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());

    }
}
