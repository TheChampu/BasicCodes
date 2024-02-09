import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimplePointerDraw extends JFrame {
    private int x, y;
    private boolean isDragging;

    public SimplePointerDraw() {
        setTitle("Simple Pointer Draw");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        isDragging = false;

        // Add mouse motion listener to handle drawing
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (isDragging) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }
            }
        });

        // Add mouse listener to handle starting and stopping drawing
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                isDragging = true;
                x = e.getX();
                y = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                isDragging = false;
            }
        });
    }

    // Override paintComponent to draw on the JFrame
    public void paint(Graphics g) {
        super.paint(g);
        if (isDragging) {
            g.setColor(Color.BLACK);
            g.fillOval(x, y, 10, 10); // Adjust the size of the drawn object as needed
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimplePointerDraw().setVisible(true));
    }
}
//Shivanshu Deo