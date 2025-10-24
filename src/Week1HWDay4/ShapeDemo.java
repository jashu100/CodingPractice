package Week1HWDay4;

// Base class
class Shape {
    // Methods to be overridden by specific shapes
    double area() {
        return 0;
    }

    double perimeter() {
        return 0;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Circle circ = new Circle(7);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        System.out.println("Circle Area: " + circ.area());
        System.out.println("Circle Perimeter: " + circ.perimeter());
    }
}

