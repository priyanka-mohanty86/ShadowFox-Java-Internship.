import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class InventoryGUI {

    static ArrayList<Product> list = new ArrayList<>();
    static JTextArea area;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Inventory System");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 150, 25);
        frame.add(nameField);

        JLabel qtyLabel = new JLabel("Quantity:");
        qtyLabel.setBounds(20, 60, 100, 25);
        frame.add(qtyLabel);

        JTextField qtyField = new JTextField();
        qtyField.setBounds(120, 60, 150, 25);
        frame.add(qtyField);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(20, 100, 80, 30);
        frame.add(addBtn);

        JButton viewBtn = new JButton("View");
        viewBtn.setBounds(110, 100, 80, 30);
        frame.add(viewBtn);

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(200, 100, 80, 30);
        frame.add(deleteBtn);

        area = new JTextArea();
        area.setBounds(20, 150, 350, 180);
        frame.add(area);

        // Add Button
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int qty = Integer.parseInt(qtyField.getText());

                list.add(new Product(name, qty));
                area.setText("Item added successfully.");
            }
        });

        // View Button
        viewBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                for (int i = 0; i < list.size(); i++) {
                    Product p = list.get(i);
                    area.append((i + 1) + ". " + p.name + " - " + p.quantity + "\n");
                }
            }
        });

        // Delete Button
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter item number to delete:");
                int index = Integer.parseInt(input);

                if (index > 0 && index <= list.size()) {
                    list.remove(index - 1);
                    area.setText("Item deleted.");
                } else {
                    area.setText("Invalid number.");
                }
            }
        });

        frame.setVisible(true);
    }
}