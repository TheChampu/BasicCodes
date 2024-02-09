import java.awt.*;
import java.awt.event.*;

public class SimpleEventHandling extends Frame implements ActionListener {
    private Button button;

    public SimpleEventHandling() {
        button = new Button("Click Me");
        button.addActionListener(this);

        add(button);
        setSize(300, 200);
        setTitle("Simple Event Handling");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new SimpleEventHandling();
    }
}
//Shivanshu Deo