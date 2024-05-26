package swing.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonWithActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button With Action Litener");
        frame.setSize(400, 500);

        JButton button = new JButton("Click Me");
        button.setBounds(200, 200, 100, 70);

        final JTextField tf = new JTextField();
        tf.setBounds(100,100,200, 25);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome To Javatpoint");
            }
        });

        frame.add(button);
        frame.add(tf);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
