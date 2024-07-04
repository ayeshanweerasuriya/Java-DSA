import java.util.ArrayList;
import javax.swing.*;

// Define the Observer interface
interface Observer {
    void update(boolean isAreaCleared);
}

// Implement the Helicopter class that implements Observer
class Helicopter extends JFrame implements Observer {

    JLabel areaLabel;
    MainController controller;

    Helicopter(MainController controller) {
        this.controller = controller; // Initialize the MainController reference
        this.setTitle("Helicopter");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        areaLabel = new JLabel(); // Initialize the JLabel
        areaLabel.setText("Area Not Cleared");
        areaLabel.setBounds(10, 10, 150, 25);
        this.add(areaLabel); // Add the JLabel to the frame
        this.setLayout(null); // Use null layout for absolute positioning

        JButton sendMessageButton = new JButton("Send Message");
        sendMessageButton.setBounds(10, 50, 150, 25);
        sendMessageButton.addActionListener(e -> {
            controller.receiveMessage("Message from Helicopter");
        });
        this.add(sendMessageButton);

        this.setVisible(true);
    }

    @Override
    public void update(boolean isAreaCleared) {
        areaLabel.setText(isAreaCleared ? "Area is Cleared" : "Area Not Cleared");
    }
}

// Implement the Tank class that implements Observer
class Tank extends JFrame implements Observer {
    JLabel areaLabel;

    Tank() {
        this.setTitle("Tank");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        areaLabel = new JLabel(); // Initialize the JLabel
        areaLabel.setText("Area Not Cleared");
        areaLabel.setBounds(10, 10, 150, 25);
        this.add(areaLabel); // Add the JLabel to the frame
        this.setLayout(null); // Use null layout for absolute positioning
        this.setVisible(true);
    }

    @Override
    public void update(boolean isAreaCleared) {
        areaLabel.setText(isAreaCleared ? "Area is Cleared" : "Area Not Cleared");
    }
}

// Implement the Tank class that implements Observer
class Submarine extends JFrame implements Observer {
    JLabel areaLabel;

    Submarine() {
        this.setTitle("Submarine");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        areaLabel = new JLabel(); // Initialize the JLabel
        areaLabel.setText("Area Not Cleared");
        areaLabel.setBounds(10, 10, 150, 25);
        this.add(areaLabel); // Add the JLabel to the frame
        this.setLayout(null); // Use null layout for absolute positioning
        this.setVisible(true);
    }

    @Override
    public void update(boolean isAreaCleared) {
        areaLabel.setText(isAreaCleared ? "Area is Cleared" : "Area Not Cleared");
    }
}

// MainController class that manages the observers and state
class MainController extends JFrame {
    private boolean clicked = true;
    private ArrayList<Observer> observers = new ArrayList<>();

    MainController() {
        this.setTitle("Main Controller");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        JCheckBox areaClearCheckbox = new JCheckBox("Area Clear");
        areaClearCheckbox.setBounds(50, 10, 100, 25); // Adjusted bounds
        this.add(areaClearCheckbox);
        this.setLayout(null); // Use null layout for absolute positioning

        areaClearCheckbox.addActionListener(e -> {
            if (areaClearCheckbox.isSelected()) {
                this.setClicked(true);
            } else {
                this.setClicked(false);
            }
        });
    }

    // Method to add an observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to set the clicked state and notify observers
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
        notifyObservers();
    }

    // Method to notify all observers of the current state
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(clicked);
        }
    }

    // Method to receive a message from an observer
    public void receiveMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        MainController controller = new MainController();

        // Add observers to the controller
        controller.addObserver(new Helicopter(controller));
        controller.addObserver(new Tank());
        controller.addObserver(new Submarine());
    }
}
