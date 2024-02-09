import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends Frame {
    public MouseAdapterExample() {
        setTitle("Mouse Adapter Example");
        setSize(300, 200);

        // Using MouseAdapter to handle mouse events
        addMouseListener(new MyMouseAdapter());

        // Closing the frame
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // Custom MouseAdapter class
    private class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse Entered at: (" + e.getX() + ", " + e.getY() + ")");
        }

        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse Exited at: (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
//Shivanshu Deo