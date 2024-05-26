package swing.text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordField implements ActionListener {

    JFrame frame;
    JTextField username;
    JPasswordField password;

    JButton button;

    JLabel label;

    PasswordField(){
        frame = new JFrame("Password With Action");
        frame.setSize(350, 350);

        JLabel label1 = new JLabel("Username:");
        label1.setBounds(30, 30 , 100, 30);
        username = new JTextField();
        username.setBounds(100, 30, 150, 30);

        JLabel label2 = new JLabel("Password: ");
        label2.setBounds(30, 75, 100, 30);
        password = new JPasswordField();
        password.setBounds(100, 75, 150, 30);

        button = new JButton("Login");
        button.setBounds(100, 120, 100, 30 );
        button.addActionListener(this);

        label = new JLabel();
        label.setBounds(30, 170, 300, 30);

        frame.add(label1);
        frame.add(username);
        frame.add(label2);
        frame.add(password);
        frame.add(button);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = "Username: "+username.getText()+" , "+"Password: "+ String.valueOf(password.getPassword());
        label.setText(text);

    }

    public static void main(String[] args) {
        new PasswordField();
    }


}
