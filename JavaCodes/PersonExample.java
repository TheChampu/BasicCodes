import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Method to take input from the user
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    // Method to display the data
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonExample {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person();

        // Taking input from the user
        person.inputData();

        // Displaying the data
        System.out.println("Entered Data:");
        person.displayData();
    }
}
//Shivanshu Deo