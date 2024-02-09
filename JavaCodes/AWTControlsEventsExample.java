import java.awt.*;
import java.awt.event.*;

public class AWTControlsEventsExample extends Frame implements ActionListener, ItemListener {
    private Label label;
    private Button button;
    private Checkbox checkbox1, checkbox2, checkbox3;
    private CheckboxGroup checkboxGroup;

    public AWTControlsEventsExample() {
        // Frame settings
        setTitle("AWT Controls Events Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Label
        label = new Label("Welcome to AWT Controls Events Example");
        add(label);

        // Button
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);

        // Checkbox Group
        checkboxGroup = new CheckboxGroup();

        // Checkboxes
        checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        checkbox3 = new Checkbox("Option 3", checkboxGroup, false);

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);

        add(checkbox1);
        add(checkbox2);
        add(checkbox3);

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
        Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
        if (selectedCheckbox != null) {
            System.out.println("Selected Checkbox: " + selectedCheckbox.getLabel());
        }
    }

    public static void main(String[] args) {
        new AWTControlsEventsExample();
    }
}
//Shivanshu Deo