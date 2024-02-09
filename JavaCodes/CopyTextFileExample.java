import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFileExample {

    public static void main(String[] args) {
        try {
            // Specify the paths for source and destination files
            String sourceFilePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\NewFileExample.txt";
            String destinationFilePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\MyTextFile.txt";

            // Copy the content from the source file to the destination file
            copyTextFile(sourceFilePath, destinationFilePath);

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void copyTextFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline after each line (optional)
            }
        }
    }
}
//Shivanshu Deo