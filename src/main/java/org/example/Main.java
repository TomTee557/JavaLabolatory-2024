package org.example;

public class Main {
    public static void main(String[] args) {
        ShapeDAO dao = new ShapeDAO();

        // Tworzenie obiektów
        Color redColor = new Color(255, 0, 0, 255);
        Triangle triangle = new Triangle(3, 4, 5, redColor);
        Rectangle rectangle = new Rectangle(2, 4, redColor);

        // Zapis obiektów do bazy danych
        dao.save(triangle);
        dao.save(rectangle);

        // Pobranie obiektu z bazy danych
        Triangle foundTriangle = (Triangle) dao.getById(Triangle.class, 1L);
        ShapeDescriber.describe(foundTriangle);

        dao.close();
    }
}