import java.util.Random;

     class RGBColor {
    private int r, g, b;

    // Konstruktor z ograniczeniem zakresu dla kolorów
    public RGBColor(int r, int g, int b) {
        this.r = validateColorValue(r);
        this.g = validateColorValue(g);
        this.b = validateColorValue(b);
    }



    // Pusty konstruktor tworzący obiekt losowo
    public RGBColor() {
        Random random = new Random();
        this.r = random.nextInt(256);
        this.g = random.nextInt(256);
        this.b = random.nextInt(256);
    }

    // Metoda do mieszania kolorów
    public static RGBColor mixColors(RGBColor color1, RGBColor color2) {
        int mixedR = (color1.r + color2.r) / 2;
        int mixedG = (color1.g + color2.g) / 2;
        int mixedB = (color1.b + color2.b) / 2;
        return new RGBColor(mixedR, mixedG, mixedB);
    }

    // Metoda prywatna do walidacji wartości kolorów
    private int validateColorValue(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        } else {
            return value;
        }
    }

    // Metoda toString do wygodnego wyświetlania obiektu
    @Override
    public String toString() {
        return "RGBColor [r=" + r + ", g=" + g + ", b=" + b + "]";
    }
    public int getR() {
            return this.r;
    }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }

    // Przykład użycia
    public static void main(String[] args) {
        RGBColor color1 = new RGBColor(100, 150, 200);
        RGBColor color2 = new RGBColor(50, 75, 100);

        System.out.println("Color 1: " + color1);
        System.out.println("Color 2: " + color2);

        RGBColor mixedColor = RGBColor.mixColors(color1, color2);
        System.out.println("Mixed Color: " + mixedColor);

        RGBColor randomColor = new RGBColor();
        System.out.println("Random Color: " + randomColor);
    }
}
