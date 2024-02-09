// Interface definition
interface Shape {
    void draw();  // Abstract method
}

// Classes implementing the interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Main program
public class Interface {
    public static void main(String[] args) {
        // Using polymorphism with interfaces
        Shape circle = new Circle();
        Shape square = new Square();

        // Drawing shapes without knowing the specific class
        circle.draw();
        square.draw();
    }
}
//Shivanshu Deo