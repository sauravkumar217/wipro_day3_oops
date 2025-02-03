/*Create a class structure for a Shape Drawing Application. Start with an abstract 
class Shape with a method draw(). Derive two classes: Circle and Rectangle. Implement 
the draw() method in both derived classes to display specific messages such as “Drawing 
a Circle” and “Drawing a Rectangle”. In the main program, create an array of Shape 
objects (including both circles and rectangles) and call the draw() method on each. 
Demonstrate polymorphism through this array.*/

// Abstract class Shape
abstract class Shape {
    // Abstract method draw()
    public abstract void draw();
}

// Derived class Circle
class Circle extends Shape {
    // Implementation of draw() for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    // Implementation of draw() for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}


public class ShapeDrawingApplication {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];

        // Add Circle and Rectangle objects to the array
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        // Iterate through the array and call the draw() method
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}