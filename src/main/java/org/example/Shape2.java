package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import java.io.Serializable;

//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = Triangle.class, name = "triangle")
})
public abstract class Shape2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String className;

    @Embedded
    private Color color;

    public Shape2(String className, Color color) {
        this.className = className;
        this.color = color;
    }

    protected Shape2() {
        // Konstruktor bezargumentowy wymagany przez JPA
    }

    @PrePersist
    public void setClassNameBeforePersist() {
        this.className = this.getClass().getName(); // Automatycznie ustaw wartość przed zapisem
    }

    public String getClassName() {
        return className;
    }

    public Color getColor() {
        return color;
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
}