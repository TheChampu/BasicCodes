// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class extending the parent class
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);  // Using super to call the constructor of the parent class
        this.breed = breed;
    }

    // Overriding the eat method of the parent class
    @Override
    void eat() {
        super.eat();  // Using super to call the eat method of the parent class
        System.out.println(name + " is eating parle-g.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main program
public class SuperKeywordExample {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Dog myDog = new Dog("Simba", "Labrador");

        // Calling methods
        myDog.eat();   // Calls overridden method in Dog class
        myDog.bark();  // Calls method in Dog class
    }
}
//Shivanshu Deo