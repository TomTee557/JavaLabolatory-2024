package org.example;

import org.junit.jupiter.api.Test;

public class ShapeDescriberTest {

    @Test
    public void testDescribe() {
        Color color = new Color(255, 0, 0, 255);
        Triangle triangle = new Triangle(3, 4, 5, color);

        // Test logowania (bez wyjątków)
        ShapeDescriber.describe(triangle);
    }
}
