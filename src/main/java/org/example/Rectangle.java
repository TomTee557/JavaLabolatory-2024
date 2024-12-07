package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape2 {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(Rectangle.class.getName(), color);
        this.width = width;
        this.height = height;
    }

    protected Rectangle() {
        // Konstruktor bezargumentowy wymagany przez JPA
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}