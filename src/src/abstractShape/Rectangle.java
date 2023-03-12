package abstractShape;

public class Rectangle extends Shape {

    protected Rectangle(int a, int b) {
    }

    @Override
    double returnArea() {
        int area;
        int a = 0;
        int b = 5;
        area = a * b;
        return area;
    }

    @Override
    double returnPerimeter() {
        int a = 7;
        int b = 3;
        int perimetru;
        perimetru = 2 * (a + b);
        return perimetru;
    }
}
