package org.example;

public record Color(int red, int green, int blue, int alpha) {
    // Przeciążenie konstruktora kanonicznego w celu ustawienia wartości alpha = 0
    public Color(int red, int green, int blue) {
        this(red, green, blue, 0);
    }

    // walidacja
    public Color {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255 || alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("Wartości RGB i Alpha muszą być w zakresie 0-255.");
        }
    }
}