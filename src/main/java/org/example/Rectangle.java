package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Rectangle extends Shape2 {
    @Column(name = "side_a", nullable = false)
    private double a;

    @Column(name = "side_b", nullable = false)
    private double b;

    public Rectangle(double a, double b, Color color) {
        super(Rectangle.class.getSimpleName(), color);
        this.a = a;
        this.b = b;
    }

    protected Rectangle() {
        // Konstruktor bezargumentowy wymagany przez Hibernate
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}