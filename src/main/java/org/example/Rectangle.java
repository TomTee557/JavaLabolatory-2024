package org.example;

// Zadanie 3.
public class Rectangle extends Shape2 {
    public double a;
    public double b;

    public Rectangle(double a, double b, Color color) {
        super(Rectangle.class.getName(), color);
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
