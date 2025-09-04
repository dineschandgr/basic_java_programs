package OOPS;

abstract class Shape {
    abstract void draw(); // abstract method (no body)

    void info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape s = new Circle(); // cannot create Shape directly
        s.info();
        s.draw();
    }
}
