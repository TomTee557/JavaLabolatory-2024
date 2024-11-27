package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    public void testValidColor() {
        Color color = new Color(255, 128, 64, 255);
        assertEquals(255, color.red());
        assertEquals(128, color.green());
        assertEquals(64, color.blue());
        assertEquals(255, color.alpha());
    }

    @Test
    public void testDefaultAlphaConstructor() {
        Color color = new Color(255, 128, 64);
        assertEquals(255, color.red());
        assertEquals(128, color.green());
        assertEquals(64, color.blue());
        assertEquals(0, color.alpha()); // Alpha powinno wynosić 0
    }

    @Test
    public void testInvalidColorValues() {
        // Sprawdzanie nieprawidłowych wartości (rzutowanie wyjątku)
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 128, 64, 255));
        assertThrows(IllegalArgumentException.class, () -> new Color(255, 300, 64, 255));
        assertThrows(IllegalArgumentException.class, () -> new Color(255, 128, 64, -10));
    }

    @Test
    public void testEdgeCases() {
        // Graniczne wartości (0 i 255) powinny działać poprawnie
        Color colorMin = new Color(0, 0, 0, 0);
        assertEquals(0, colorMin.red());
        assertEquals(0, colorMin.green());
        assertEquals(0, colorMin.blue());
        assertEquals(0, colorMin.alpha());

        Color colorMax = new Color(255, 255, 255, 255);
        assertEquals(255, colorMax.red());
        assertEquals(255, colorMax.green());
        assertEquals(255, colorMax.blue());
        assertEquals(255, colorMax.alpha());
    }
}