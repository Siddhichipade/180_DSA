abstract class Shape {
    // Abstract method
    abstract void draw();

    // Non-abstract method
    void description() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class AbstractMethodExample {
    public static void main(String[] args) {
        // Create objects of subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call implemented methods
        circle.draw();
        rectangle.draw();

        // Call non-abstract method
        circle.description();
    }
}
