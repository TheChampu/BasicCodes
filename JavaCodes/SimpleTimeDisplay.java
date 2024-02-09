import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleTimeDisplay {

    public static void main(String[] args) {
        displayCurrentTime();
    }

    private static void displayCurrentTime() {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            System.out.println("Current Time: " + formattedTime);

            try {
                // Sleep for 1 second before updating the time again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clear the console (for a cleaner display, optional)
            clearConsole();
        }
    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//Shivanshu Deo