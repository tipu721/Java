package reflection;

import javax.swing.*;

import static java.lang.System.out;

public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException {

        Object ob = null;

        Class classDefinition = Class.forName("javax.swing.JLabel");

        try {
            ob = classDefinition.newInstance();
        }

        catch (InstantiationException e) {
            e.printStackTrace();
        }

        catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        JLabel label;

        if(ob instanceof JLabel){
            label = (JLabel) ob;
        }
        else {
            return;
        }
        System.out.println("Reaching Here !");
        System.out.println(label.getText());


    }
}
