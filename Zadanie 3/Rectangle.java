// Zadanie 3.
public class Rectangle extends Shape2 {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        super(Rectangle.class.getName());
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

}
