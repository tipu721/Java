package main.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LabelWithAction {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Label With Action Listener");
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 30);
        JLabel label = new JLabel();
        label.setBounds(50,100, 250, 30);

        JButton button = new JButton("Find IP");
        button.setBounds(50, 150, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    InetAddress ip = InetAddress.getByName(textField.getText());
                    System.out.println(ip);
                    String domainName = ip.getHostName();
                    String ipAddress = ip.getHostAddress();
                    String text = "IP of "+domainName+ " is :"+ipAddress;
                    label.setText(text);
                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });







        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
