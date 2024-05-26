package swing.button;

import javax.swing.*;

public class ButtonWithImage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button With Image");


        JButton button = new JButton(new ImageIcon("C:\\Users\\User\\Desktop\\Rakhi\\download.jpg"));
        button.setBounds(200, 200, 100, 80);

        frame.add(button);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
