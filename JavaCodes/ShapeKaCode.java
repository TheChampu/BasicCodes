abstract class Shape01 {
    protected int side1;
    protected int side2;

    public Shape01(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Abstract method to be implemented by subclasses
    public abstract void printArea();
}

class Rectangle extends Shape01 {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    // Implementation of printArea for Rectangle
    public void printArea() {
        int area = side1 * side2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape01 {
    public Triangle(int base, int height) {
        super(base, height);
    }

    // Implementation of printArea for Triangle
    public void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle01 extends Shape01 {
    public Circle01(int radius) {
        super(radius, 0); // Considering side2 as 0 for simplicity (radius is enough for a circle)
    }

    // Implementation of printArea for Circle
    public void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeKaCode {
    public static void main(String[] args) {
        // Creating objects of each shape
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 8);
        Circle01 circle = new Circle01(6);

        // Calling printArea for each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
//Shivanshu Deo