package org.example;

import jakarta.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Shape2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name", nullable = false)
    private String className;

    @Embedded
    private Color color;

    public Shape2(String className, Color color) {
        this.className = className;
        this.color = color;
    }

    protected Shape2() {
        // Konstruktor bezargumentowy wymagany przez Hibernate
    }

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                color.red(), color.green(), color.blue(), color.alpha());
    }

    public Long getId() {
        return id;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getClassName() {
        return className;
    }

    public Color getColor() {
        return color;
    }

    public void print() {
        System.out.println("Class Name: " + className);
        System.out.println("Color: " + getColorDescription());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}