import java.io.File;
import java.io.IOException;

public class CreateNewFileExample {

    public static void main(String[] args) {
        try {
            // Specify the path for the new file
            String filePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\NewFileExample.txt";

            // Create a File object
            File newFile = new File(filePath);

            // Check if the file already exists
            if (newFile.exists()) {
                System.out.println("File already exists.");
            } else {
                // Attempt to create the new file
                boolean fileCreated = newFile.createNewFile();

                if (fileCreated) {
                    System.out.println("New file created successfully: " + newFile.getAbsolutePath());
                } else {
                    System.out.println("Failed to create the new file.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
//Shivanshu Deo