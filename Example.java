import javax.swing.*;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

class Helicopter {

    private void Helicopter() {
        JFrame frame = new JFrame("Helicopter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 450);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Area Not Cleared Label
        JLabel areaLabel = new JLabel("Area Not Cleared");
        areaLabel.setBounds(10, 10, 150, 25);
        panel.add(areaLabel);

        // Shoot Button
        JButton shootButton = new JButton("Shoot");
        shootButton.setBounds(10, 40, 100, 25);
        panel.add(shootButton);

        // Missile Operation Button (Disabled)
        JButton missileButton = new JButton("Missile Operation");
        missileButton.setBounds(120, 40, 150, 25);
        missileButton.setEnabled(false);
        panel.add(missileButton);

        // Laser Operation Button (Disabled)
        JButton laserButton = new JButton("Laser Operation");
        laserButton.setBounds(10, 70, 150, 25);
        laserButton.setEnabled(false);
        panel.add(laserButton);

        // Soldier Count Label and Spinner
        JLabel soldierCountLabel = new JLabel("Soldier Count");
        soldierCountLabel.setBounds(330, 20, 100, 25);
        panel.add(soldierCountLabel);

        JSpinner soldierCountSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        soldierCountSpinner.setBounds(468, 20, 40, 25);
        panel.add(soldierCountSpinner);

        // Ammo Count Label and Spinner
        JLabel ammoCountLabel = new JLabel("Ammo Count");
        ammoCountLabel.setBounds(330, 50, 100, 25);
        panel.add(ammoCountLabel);

        JSpinner ammoCountSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        ammoCountSpinner.setBounds(468, 50, 40, 25);
        panel.add(ammoCountSpinner);

        // Position Checkbox
        JCheckBox positionCheckbox = new JCheckBox("Position");
        positionCheckbox.setBounds(330, 80, 100, 25);
        panel.add(positionCheckbox);

        // Text Area
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 120, 500, 200);
        panel.add(scrollPane);

        // Slider
        JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 100);
        slider.setBounds(550, 20, 50, 355);
        slider.setPaintLabels(true); // Add this line to paint labels
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        // Add this block to set custom labels
        Dictionary<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel(" -- 0"));
        labelTable.put(10, new JLabel(" -"));
        labelTable.put(20, new JLabel(" - 20"));
        labelTable.put(30, new JLabel(" -"));
        labelTable.put(40, new JLabel(" -- 40"));
        labelTable.put(50, new JLabel(" -"));
        labelTable.put(60, new JLabel(" -  60"));
        labelTable.put(70, new JLabel(" -"));
        labelTable.put(80, new JLabel(" -- 80"));
        labelTable.put(90, new JLabel(" -"));
        labelTable.put(100, new JLabel(" - 100"));
        slider.setLabelTable(labelTable);

        panel.add(slider);

        // Input Field
        JTextField inputField = new JTextField();
        inputField.setBounds(10, 340, 380, 25);
        panel.add(inputField);

        // Send Button
        JButton sendButton = new JButton("Send");
        sendButton.setBounds(410, 340, 100, 25);
        panel.add(sendButton);

        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Helicopter().Helicopter());
    }
}

class Tank {

}

class Submarine {

}

class MainController {

}