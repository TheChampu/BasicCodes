import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample extends Frame implements ItemListener {
    private Checkbox checkbox1, checkbox2;

    public CheckBoxExample() {
        checkbox1 = new Checkbox("Jai Ho");
        checkbox2 = new Checkbox("Hey Mogamboo");

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

        add(checkbox1);
        add(checkbox2);

        setSize(300, 200);
        setTitle("Checkbox Example");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            System.out.println("Option 1 selected: " + checkbox1.getState());
        } else if (e.getSource() == checkbox2) {
            System.out.println("Option 2 selected: " + checkbox2.getState());
        }
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
//Shivanshu Deo