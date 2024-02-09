import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Toggle the case
        char changedCase = Character.isUpperCase(inputChar) ?
                Character.toLowerCase(inputChar) :
                Character.toUpperCase(inputChar);

        System.out.println("Changed Case: " + changedCase);

        scanner.close();
    }
}
//Shivanshu Deo