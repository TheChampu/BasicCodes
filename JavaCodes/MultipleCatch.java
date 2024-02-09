import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter another number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;  // This will throw ArithmeticException if num2 is 0
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("This block will always execute.");
            scanner.close();
        }
    }
}
//Shivanshu Deo