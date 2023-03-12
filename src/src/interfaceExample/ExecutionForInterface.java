package interfaceExample;

public class ExecutionForInterface {
    public static void main(String[] args) {
        Drawable circle = (Drawable) new Circle();
        Drawable rectangle = (Drawable) new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
