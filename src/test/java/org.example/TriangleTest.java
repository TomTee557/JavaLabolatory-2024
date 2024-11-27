package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testArea() {
        // osobna inicjalizajcja obiektów w każdym tescie - dobra praktyka
        Color color = new Color(255, 0, 0, 255);
        Triangle triangle = new Triangle(5, 10, 12, color);
        assertEquals(24.544602257930357, triangle.getArea(), "Pole powinno wynosić 24.544602257930357");
    }

    @Test
    public void testPerimeter() {
        Color color = new Color(255, 0, 0, 255);
        Triangle triangle = new Triangle(5, 10, 12, color);
        assertEquals(27.0, triangle.getPerimeter(), "Obwód powinien wynosić 27.0");
    }

    @Test
    public void testColorDescription() {
        Color color = new Color(255, 0, 0, 255);
        Triangle triangle = new Triangle(5, 10, 12, color);
        assertEquals("Red: 255, Green: 0, Blue: 0, Alpha: 255", triangle.getColorDescription());
    }
}