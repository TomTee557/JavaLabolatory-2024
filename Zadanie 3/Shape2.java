// Zadanie 3.
abstract public class Shape2 {
    public String className;
    // konstruktor parametryzowalny, odpalany przez klasy pochodne za pomocą metody super(className);
    public Shape2(String className){
       this.className = className;
    }

    public void print() {
        System.out.println("className is: " + className);
    };

    public abstract double getArea();
    public abstract double getPerimeter();
}
