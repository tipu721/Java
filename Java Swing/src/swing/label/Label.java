package swing.label;

import javax.swing.*;

public class Label {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");

        JLabel label1 = new JLabel("First Label");
        JLabel label2 = new JLabel("2nd Label");
        label1.setBounds(50, 50, 100, 30);
        label2.setBounds(50,100,100,30);

        frame.add(label1);
        frame.add(label2);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
