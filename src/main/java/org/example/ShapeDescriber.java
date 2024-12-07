package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    // Logger dla danej klasy
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public static void describe(Shape2 shape) {
        // Wywołanie metody print() z klasy Shape
        //shape.print();

        // Logowanie informacji o figurze
        logger.info("Opis figury:");
        logger.info("Typ figury: {}", shape.getClassName());
        logger.info("Kolor figury: {}", shape.getColorDescription());
        logger.info("Pole figury: {}", shape.getArea());
        logger.info("Obwód figury: {}", shape.getPerimeter());
    }
}