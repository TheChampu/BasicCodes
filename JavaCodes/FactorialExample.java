import java.util.Scanner;

class FactorialCalculator {
    // Method to calculate factorial
    public long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        // Creating an object of FactorialCalculator class
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        // Calculating and displaying the factorial
        long result = factorialCalculator.calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
//Shivanshu Deo