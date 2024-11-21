//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu z wartością alpha -> konstruktor kanoniczny
        Color colorWithAlpha = new Color(100, 170, 250, 164);
        System.out.println("Kolor z alpha: " + colorWithAlpha);
        System.out.println("Red: " + colorWithAlpha.red());
        System.out.println("Green: " + colorWithAlpha.green());
        System.out.println("Blue: " + colorWithAlpha.blue());
        System.out.println("Alpha: " + colorWithAlpha.alpha());

        // Tworzenie obiektu bez podania alpha - parametr domyslny - konstruktor przeciążony
        Color colorWithoutAlpha = new Color(255, 255, 255);
        System.out.println("\nKolor bez alpha: " + colorWithoutAlpha);
        System.out.println("Red: " + colorWithoutAlpha.red());
        System.out.println("Green: " + colorWithoutAlpha.green());
        System.out.println("Blue: " + colorWithoutAlpha.blue());
        System.out.println("Alpha: " + colorWithoutAlpha.alpha());

        Color colorWithException = new Color(300, 255, 255);
    }
}