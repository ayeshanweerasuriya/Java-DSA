import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Define the Observer interface
interface Observer {
    void update(boolean isAreaCleared);
}

// Implement the Helicopter class that implements Observer
class Helicopter extends JFrame implements Observer {

    JLabel areaLabel;

    Helicopter() {
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
        this.setVisible(true);
    }

    @Override
    public void update(boolean isAreaCleared) {
        if (isAreaCleared) {
            areaLabel.setText("Area is Cleared");
        } else {
            areaLabel.setText("Area Not Cleared");
        }
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
        if (isAreaCleared) {
            areaLabel.setText("Area is Cleared");
        } else {
            areaLabel.setText("Area Not Cleared");
        }
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
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        MainController controller = new MainController();

        // Add observers to the controller
        controller.addObserver(new Helicopter());
        controller.addObserver(new Tank());
    }
}
