import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

class Customer {
    private String id;
    private String name;
    private String address;
    private double salary;

    public Customer() {
        //
    }

    public Customer(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}

class AddCustomerForm extends JFrame {
    private JLabel lblTitle;
    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtAddress;
    private JTextField txtSalary;

    private JButton btnAddCustomer;
    private JButton btnCancel;

    private ArrayList<Customer> customerList;

    AddCustomerForm(ArrayList<Customer> customerList) {
        this.customerList = customerList;
        setSize(400, 300);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // -----------------------------------------
        lblTitle = new JLabel("Add Customer Form");
        lblTitle.setFont(new Font("", 1, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        // -----------------------------------------
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnAddCustomer = new JButton("Add Customer");
        btnAddCustomer.setFont(new Font("", 1, 18));
        btnAddCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String id = txtId.getText();
                String name = txtName.getText();
                String address = txtAddress.getText();
                double salary = Double.parseDouble(txtSalary.getText());

                Customer customer = new Customer(id, name, address, salary);
                customerList.add(customer);
            }
        });
        buttonPanel.add(btnAddCustomer);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 18));
        buttonPanel.add(btnCancel);

        add("South", buttonPanel);

        // -------------------------------------------
        JPanel labelPanel = new JPanel(new GridLayout(4, 1));
        lblId = new JLabel("Id");
        lblId.setFont(new Font("", 1, 18));
        labelPanel.add(lblId);

        lblName = new JLabel("Name");
        lblName.setFont(new Font("", 1, 18));
        labelPanel.add(lblName);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("", 1, 18));
        labelPanel.add(lblAddress);

        lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("", 1, 18));
        labelPanel.add(lblSalary);

        add("West", labelPanel);

        // ----------------------------------------------
        JPanel textPanel = new JPanel(new GridLayout(4, 1));
        txtId = new JTextField();
        txtId.setFont(new Font("", 1, 18));
        textPanel.add(txtId);

        txtName = new JTextField();
        txtName.setFont(new Font("", 1, 18));
        textPanel.add(txtName);

        txtAddress = new JTextField();
        txtAddress.setFont(new Font("", 1, 18));
        textPanel.add(txtAddress);

        txtSalary = new JTextField();
        txtSalary.setFont(new Font("", 1, 18));
        textPanel.add(txtSalary);

        add("Center", textPanel);
    }
}

class ViewCustomerForm extends JFrame {
    private JLabel lblTitle;
    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtAddress;
    private JTextField txtSalary;

    private JButton btnBack;
    private JButton btnNext;

    private ArrayList<Customer> customerList;

    private int index; // 0>=index && index<customerList.size()

    ViewCustomerForm(ArrayList<Customer> customerList) {
        this.customerList = customerList;
        setSize(400, 300);
        setTitle("View Customer Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // -----------------------------------------
        lblTitle = new JLabel("View Customer Form");
        lblTitle.setFont(new Font("", 1, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        // -----------------------------------------
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", 1, 18));
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        });
        buttonPanel.add(btnBack);

        btnNext = new JButton("Next");
        btnNext.setFont(new Font("", 1, 18));
        buttonPanel.add(btnNext);

        add("South", buttonPanel);

        // -------------------------------------------
        JPanel labelPanel = new JPanel(new GridLayout(4, 1));
        lblId = new JLabel("Id");
        lblId.setFont(new Font("", 1, 18));
        labelPanel.add(lblId);

        lblName = new JLabel("Name");
        lblName.setFont(new Font("", 1, 18));
        labelPanel.add(lblName);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("", 1, 18));
        labelPanel.add(lblAddress);

        lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("", 1, 18));
        labelPanel.add(lblSalary);

        add("West", labelPanel);

        // ----------------------------------------------
        JPanel textPanel = new JPanel(new GridLayout(4, 1));
        txtId = new JTextField();
        txtId.setFont(new Font("", 1, 18));
        textPanel.add(txtId);

        txtName = new JTextField();
        txtName.setFont(new Font("", 1, 18));
        textPanel.add(txtName);

        txtAddress = new JTextField();
        txtAddress.setFont(new Font("", 1, 18));
        textPanel.add(txtAddress);

        txtSalary = new JTextField();
        txtSalary.setFont(new Font("", 1, 18));
        textPanel.add(txtSalary);

        add("Center", textPanel);
    }
}

class Demo {
    public static void main(String args[]) {
        ArrayList<Customer> customerList = new ArrayList<>();
        new AddCustomerForm(customerList).setVisible(true);
        new ViewCustomerForm(customerList).setVisible(true);
    }
}
