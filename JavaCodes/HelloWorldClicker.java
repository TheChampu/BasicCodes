import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HelloWorldClicker extends JFrame implements MouseListener {

    public HelloWorldClicker() {
        setTitle("Hello World Clicker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            showMessage("Hello", Color.RED);
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            showMessage("World", Color.BLUE);
        }
    }

    private void showMessage(String message, Color color) {
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.PLAIN_MESSAGE);
        getContentPane().setBackground(color);
        repaint();
    }

    // Unused methods from the MouseListener interface
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new HelloWorldClicker();
    }
}
