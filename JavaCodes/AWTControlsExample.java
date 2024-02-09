import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWTControlsExample extends Frame implements ActionListener, ItemListener {
    private Choice choice;
    private List list;
    private TextField textField;
    private Button button;

    public AWTControlsExample() {
        // Frame settings
        setTitle("AWT Controls Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Choice
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.addItemListener(this);
        add(choice);

        // List
        list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.addItemListener(this);
        add(list);

        // TextField
        textField = new TextField(20);
        add(textField);

        // Button
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);

        // Closing the frame
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button Clicked");
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == choice) {
            System.out.println("Choice Selected: " + choice.getSelectedItem());
        } else if (e.getSource() == list) {
            System.out.println("List Selected: " + list.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new AWTControlsExample();
    }
}
//Shivanshu Deo