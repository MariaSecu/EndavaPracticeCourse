package abstractShape;

public class Circle extends Shape {
    public static final double PI = 3.14;

    @Override
    double returnArea() {
        int r = 3;
        double area;
        area = PI * r * r;
        return area;
    }

    @Override
    double returnPerimeter() {
        double perimeter;
        int r = 3;
        perimeter = 2 * PI * r;
        return 0;
    }
}
