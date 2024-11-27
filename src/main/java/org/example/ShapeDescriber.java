package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Zadanie 3.
public class ShapeDescriber {
    // Logger dla danej klasy dzięki niemu będziemy wyswietlać skąd pochodzi log (prefiks z daną klasą)
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public static void describe(Shape2 shape) {
        shape.print();
        // System.out.println("The Area is: " + shape.getArea());
        // System.out.println("The Perimeter is: " + shape.getPerimeter());
        logger.info("Opis figury:");
        // {} pozwala na podanie argumentu i zastosowanie znaku "," zamiast "+"
        logger.info("Typ figury: {}", shape.getClass().getSimpleName());
        logger.info("Kolor figury: {}", shape.getColorDescription());
        logger.info("Pole figury: {}", shape.getArea());
        logger.info("Obwód figury: {}", shape.getPerimeter());
    }
}
