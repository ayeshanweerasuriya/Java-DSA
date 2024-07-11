import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
    JButton exitBtn;

    MyFrame() {
        setSize(400, 400);
        setTitle("Main Window");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(3);

        setLayout(new BorderLayout());

        exitBtn = new JButton("Exit Button");
        exitBtn.setFont(new Font("", 1, 20));
        add(exitBtn);
        add("South", exitBtn);

        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
    }

    public void setText(String text) {
        exitBtn.setText(text);
    }
}

class Demo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}