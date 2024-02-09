import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreateImageExample {

    public static void main(String[] args) {
        try {
            // Set the dimensions of the image
            int width = 300;
            int height = 200;

            // Create a BufferedImage with specified width and height
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            // Create a graphics context from the BufferedImage
            java.awt.Graphics2D g2d = image.createGraphics();

            // Set background color (optional)
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, width, height);

            // Draw a rectangle on the image
            g2d.setColor(Color.BLACK);
            g2d.fillRect(50, 50, 200, 100);

            // Dispose of the graphics context
            g2d.dispose();

            // Specify the path to save the image
            String imagePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\DemoImage.png";

            // Save the BufferedImage as a PNG file
            saveImage(image, imagePath);

            System.out.println("Image created and saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void saveImage(BufferedImage image, String filePath) throws IOException {
        // Specify the format (e.g., "png")
        String format = "png";

        // Write the image to the specified file
        ImageIO.write(image, format, new File(filePath));
    }
}
//Shivanshu Deo