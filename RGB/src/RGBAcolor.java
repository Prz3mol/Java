import java.util.Random;

public class RGBAcolor extends RGBColor {
    private int alpha;

    // Konstruktor z ograniczeniem zakresu dla kanału alpha (przezroczystość)
    public RGBAcolor(int r, int g, int b, int alpha) {
        super(r, g, b); // Wywołanie konstruktora klasy bazowej (RGBColor)
        this.alpha = validateAlphaValue(alpha);
    }

    // Pusty konstruktor tworzący obiekt losowo z dodanym kanałem alpha
    public RGBAcolor() {
        super(); // Wywołanie pustego konstruktora klasy bazowej (RGBColor)
        Random random = new Random();
        this.alpha = random.nextInt(256);
    }

    // Metoda prywatna do walidacji wartości kanału alpha
    private int validateAlphaValue(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        } else {
            return value;
        }
    }

    // Przesłonięta metoda toString, aby uwzględniała kanał alpha
    @Override
    public String toString() {
        return "RGBacolor [r=" + getR() + ", g=" + getG() + ", b=" + getB() + ", alpha=" + alpha + "]";
    }



    // Przykład użycia
    public static void main(String[] args) {
        RGBAcolor alphaColor1 = new RGBAcolor(100, 150, 200, 128);
        RGBAcolor alphaColor2 = new RGBAcolor(); // Tworzenie losowego obiektu z domyślnym kanałem alpha

        System.out.println("Alpha Color 1: " + alphaColor1);
        System.out.println("Alpha Color 2: " + alphaColor2);

        RGBColor mixedColor = RGBColor.mixColors(alphaColor1, alphaColor2);
        System.out.println("Mixed Color: " + mixedColor);
    }
}