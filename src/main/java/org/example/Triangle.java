package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "triangles")
public class Triangle extends Shape2 {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, Color color) {
        super(Triangle.class.getName(), color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected Triangle() {
        // Konstruktor bezargumentowy wymagany przez JPA
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}