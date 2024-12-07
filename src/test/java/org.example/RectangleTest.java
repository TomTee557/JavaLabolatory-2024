package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testArea() {
        Color color = new Color(0, 255, 0, 255);
        Rectangle rectangle = new Rectangle(2, 10, color);
        assertEquals(20.0, rectangle.getArea(), "Pole powinno wynosić 20.0");
    }

    @Test
    public void testPerimeter() {
        Color color = new Color(0, 255, 0, 255);
        Rectangle rectangle = new Rectangle(2, 10, color);
        assertEquals(24.0, rectangle.getPerimeter(), "Obwód powinien wynosić 30.0");
    }

    @Test
    public void testColorDescription() {
        Color color = new Color(0, 255, 0, 255);
        Rectangle rectangle = new Rectangle(2, 10, color);
        assertEquals("Red: 0, Green: 255, Blue: 0, Alpha: 255", rectangle.getColorDescription());
    }
}
