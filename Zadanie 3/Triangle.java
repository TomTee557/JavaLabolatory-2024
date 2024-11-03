// Zadanie 3.
public class Triangle extends Shape2 {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        super(Triangle.class.getName());
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        // Wzór Herona
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}