package out.production.immutability;

public class ImmutableTest {
    public static void main(String[] args) {
        Point p = new Point(10,20);
        System.out.println(p);
        Point p1 = p.moveTo(11,21);
        System.out.println(p==p1);

        Point p2 = Point.of(0,0);
        Point p3 = Point.of(0,0);

        System.out.println(p2==p3);
    }

}

final class Point {
    private final double x;
    private final double y;

    private final static Point ORIGIN = new Point(0, 0);

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point moveTo(double x, double y) {
        return new Point(x, y);
    }



    public static Point of(double x, double y) {
        if (x == 0 && y == 0) {
            return ORIGIN;
        }
        return new Point(x, y);
    }

    //should not allow this
    public Point move(double x, double y) {
        return this;
    }


    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}


final class Circle {
    private final Point p;
    private final double r;

    public Circle (Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle moveTo(double x, double y) {
        return new Circle(p.moveTo(x, y), this.r);
    }
}


