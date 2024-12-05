package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Triangle extends Shape2 {
    @Column(nullable = false)
    private double a;

    @Column(nullable = false)
    private double b;

    @Column(nullable = false)
    private double c;

    public Triangle(double a, double b, double c, Color color) {
        super(Triangle.class.getSimpleName(), color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected Triangle() {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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
}