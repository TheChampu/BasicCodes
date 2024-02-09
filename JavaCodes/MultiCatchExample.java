import java.util.Scanner;

public class MultiCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());

            // Perform a division by zero to trigger an ArithmeticException
            int result = 10 / number;

            // Access an index out of bounds to trigger an ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            int value = array[10];
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Multi-catch block to handle multiple exceptions
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }

        scanner.close();
    }
}
//Shivanshu Deo