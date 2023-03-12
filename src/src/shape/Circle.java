package shape;

public class Circle extends Shape {

    public static final double PI = 3.14;

    public static double area(int r) {
        double area;
        area = PI * r * r;
        return area;
    }
}
