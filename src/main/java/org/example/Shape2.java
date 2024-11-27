package org.example;

// Zadanie 3.
abstract public class Shape2 {
    public String className;
    public Color color;

    // konstruktor parametryzowalny, odpalany przez klasy pochodne za pomocą metody super(className);
    public Shape2(String className, Color color){
        this.className = className;
        this.color = color;
    }

    public void print() {
        System.out.println("className is: " + className);
    };

    //public void getColorDescription() {
        //System.out.println("Red: " + color.red() + " Green: " + color.green() + " Blue: " + color.blue() + " Alpha: " + color.alpha());
    //};

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                color.red(), color.green(), color.blue(), color.alpha());
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
