package org.example;

public class Main {
    public static void main(String[] args) {
        // Zadanie 2.
        System.out.println("\n____Lab03 - Zadanie 2. - Kolory Figur____\n");

        Color redColor = new Color(255, 0, 0, 255);
        Color blueColor = new Color(0, 0, 255, 128);

        Triangle myTriangle = new Triangle(5, 11, 15, redColor);
        Rectangle myRectangle = new Rectangle(5, 10, blueColor);

        System.out.println("Opis trójkąta:");
        System.out.println("Pole: " + myTriangle.getArea());
        System.out.println("Obwód: " + myTriangle.getPerimeter());
        System.out.println("Kolor: " + myTriangle.getColorDescription());

        System.out.println("\nOpis prostokąta:");
        System.out.println("Pole: " + myRectangle.getArea());
        System.out.println("Obwód: " + myRectangle.getPerimeter());
        System.out.println("Kolor: " + myRectangle.getColorDescription());

        // Zadanie 3.
        System.out.println("\n____ Zadanie 3. - Logowanie SLF4J____\n");

        Color greenColor = new Color(0, 255, 0, 128);

        Triangle myTriangle2 = new Triangle(3, 4, 5, redColor);
        Triangle myTriangle3 = new Triangle(6, 7, 8, greenColor);
        Rectangle myRectangle2 = new Rectangle(5, 10, greenColor);
        Rectangle myRectangle3 = new Rectangle(2, 3, blueColor);

        ShapeDescriber.describe(myTriangle2);
        ShapeDescriber.describe(myTriangle3);
        ShapeDescriber.describe(myRectangle2);
        ShapeDescriber.describe(myRectangle3);
    }


    public static void helloWordFunc() {
        System.out.println("Hello World! :)");
    }
}