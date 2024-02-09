import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator01 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // First frame with a button
            JFrame mainFrame = new JFrame("Main Frame");
            JButton clickButton = new JButton("Click");

            // Adding an ActionListener to the button
            clickButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Open the second frame when the button is clicked
                    openFactorialFrame();
                }
            });

            mainFrame.getContentPane().add(clickButton);
            mainFrame.setSize(200, 200);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);
        });
    }

    // Function to open the second frame
    private static void openFactorialFrame() {
        JFrame factorialFrame = new JFrame("Factorial Frame");
        JTextField textField = new JTextField(10);
        JLabel resultLabel = new JLabel("Factorial: ");
        JButton calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Calculate factorial and display the result
                try {
                    int number = Integer.parseInt(textField.getText());
                    long factorial = calculateFactorial(number);
                    resultLabel.setText("Factorial: " + factorial);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        factorialFrame.setLayout(new BoxLayout(factorialFrame.getContentPane(), BoxLayout.Y_AXIS));
        factorialFrame.getContentPane().add(textField);
        factorialFrame.getContentPane().add(calculateButton);
        factorialFrame.getContentPane().add(resultLabel);

        factorialFrame.setSize(300, 150);
        factorialFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        factorialFrame.setVisible(true);
    }

    // Function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
//Shivanshu Deo