package swing.text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaWithActionListener implements  ActionListener{

    JFrame frame;
    JLabel label1, label2;
    JTextArea textArea;
    JButton button;

    TextAreaWithActionListener() {
        frame = new JFrame("Textare With Event Listener");


        label1 = new JLabel("Words: ");
        label1.setBounds(50, 50, 70, 30 );

        label2 = new JLabel("Characters: ");
        label2.setBounds(250, 50, 100, 30 );

        textArea = new JTextArea();
        textArea.setBounds(50, 150, 250, 250);


        button = new JButton("Count");
        button.setBounds(100, 450, 150, 30);
        button.addActionListener(this);



        frame.add(label1);
        frame.add(label2);
        frame.add(textArea);
        frame.add(button);
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int countChar = textArea.getText().length();
        label2.setText("Characters: "+countChar);
        int countWords = textArea.getText().split("\\s+").length;
        label1.setText("Words: "+ countWords);
    }

    public static void main(String[] args) {
        new TextAreaWithActionListener();
    }


}
