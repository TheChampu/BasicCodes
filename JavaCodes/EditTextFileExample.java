import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditTextFileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Specify the path of the text file
            String filePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\NewFileExample.txt";

            // Read the existing content from the file
            String fileContent = readFromFile(filePath);
            System.out.println("Current content of the file:\n" + fileContent);

            // Get the new content from the user
            System.out.print("\nEnter the new content: ");
            String newContent = scanner.nextLine();

            // Write the new content to the file
            writeToFile(filePath, newContent);
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}
//Shivanshu Deo