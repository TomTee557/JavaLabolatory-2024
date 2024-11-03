// Zadanie 3.
public class Main {
    public static void main(String[] args) {

        helloWordFunc();

        Triangle myTriangle = new Triangle(5, 11, 15);
        Rectangle myRectangle = new Rectangle(5, 10);

        ShapeDescriber.describe(myTriangle);
        ShapeDescriber.describe(myRectangle);
    }

    public static void helloWordFunc() {
        System.out.println("Hello World! :)");
    }
}