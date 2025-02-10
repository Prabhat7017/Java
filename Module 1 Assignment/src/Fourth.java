//Qus4. Create an interface Shape with a method draw(). Implement this interface in two classes, Circle and Rectangle, each providing its own implementation of the draw() method. Demonstrate polymorphism by calling the draw() method on instances of both classes.

public class Fourth {

    public static void main(String[] args) {
        // Using Shape reference for different objects
        Shape shape1 = new Circle();   // Polymorphic behavior
        Shape shape2 = new Rectangle(); // Polymorphic behavior

        // Calling draw() method
        shape1.draw();  // Output: Drawing a Circle
        shape2.draw();  // Output: Drawing a Rectangle
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}