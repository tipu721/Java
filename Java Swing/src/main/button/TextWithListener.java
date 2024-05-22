package main.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextWithListener implements ActionListener {

    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextWithListener(){



        tf1 = new JTextField();
        tf1.setBounds(30, 50, 150, 30);

        tf2 = new JTextField();
        tf2.setBounds(30,100,150,30);

        tf3 = new JTextField();
        tf3.setBounds(30,150,150,30);
        tf3.setEnabled(false);

        b1 = new JButton("+");
        b1.setBounds(30,200, 50,50);
        b1.addActionListener(this);

        b2 = new JButton("-");
        b2.setBounds(100, 200, 50, 50);
        b2.addActionListener(this);



        frame = new JFrame();
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(b1);
        frame.add(b2);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if(ob.equals(b1)){
            Integer res = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
            tf3.setDisabledTextColor(Color.black);
            tf3.setText(res.toString());
        }
        else if(ob.equals(b2)) {
            Integer res = Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText());
            tf3.setDisabledTextColor(Color.black);
            tf3.setText(res.toString());
        }

    }

    public static void main(String[] args) {
        new TextWithListener();
    }
}
