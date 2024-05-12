package projects;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel(); // Create a panel for buttons

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        // Add buttons to the buttonPanel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Add action listeners to the buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when Button 1 is clicked
                System.out.println("Button 1 clicked!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when Button 2 is clicked
                System.out.println("Button 2 clicked!");
            }
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Add the buttonPanel to the main panel
        panel.add(buttonPanel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.pack();

        // Load your custom logo image
        ImageIcon logoIcon = new ImageIcon("./Emoji.jpg");
        Image logoImage = logoIcon.getImage();

        // Set the custom logo as the icon for the frame
        frame.setIconImage(logoImage);

        // Set the size of the frame to 600x400 pixels
        frame.setSize(600, 400);

        // Set the location of the frame to the center of the screen
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}