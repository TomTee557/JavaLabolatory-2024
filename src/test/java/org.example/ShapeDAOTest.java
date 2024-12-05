package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeDAOTest {

    @BeforeAll
    static void setup() {
        ShapeDAO.save(new Rectangle(10, 20, new Color(255, 0, 0, 255)));
    }

    @Test
    public void testSaveAndRetrieveRectangle() {
        Rectangle rectangle = new Rectangle(15, 30, new Color(0, 255, 0, 255));
        ShapeDAO.save(rectangle);

        Rectangle retrieved = ShapeDAO.getById(Rectangle.class, rectangle.getId());
        assertNotNull(retrieved, "Rectangle should be retrieved from database");
        assertEquals(15, retrieved.getA(), "Side A should match");
        assertEquals(30, retrieved.getB(), "Side B should match");
    }

    @Test
    public void testDeleteRectangle() {
        Rectangle rectangle = new Rectangle(7, 14, new Color(128, 128, 128, 255));
        ShapeDAO.save(rectangle);

        ShapeDAO.delete(Rectangle.class, rectangle.getId());
        Rectangle deleted = ShapeDAO.getById(Rectangle.class, rectangle.getId());
        assertNull(deleted, "Rectangle should be deleted from database");
    }

    @AfterAll
    static void tearDown() {
        ShapeDAO.close();
    }
}