import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {
        try {
            // Specify the path of the file to be deleted
            String filePath = "C:\\Users\\Shivanshu\\Downloads\\ShivanshuDeo\\NewFileExample.txt";

            // Delete the file
            deleteFile(filePath);

            System.out.println("File deleted successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void deleteFile(String filePath) {
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists()) {
            // Attempt to delete the file
            boolean deleted = fileToDelete.delete();

            if (!deleted) {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
//Shivanshu Deo