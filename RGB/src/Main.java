public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RGBColor red = new RGBColor(255,0,0);
        RGBColor blue = new RGBColor(0,0,255);
        System.out.println(red);
        System.out.println(RGBColor.mixColors(red,blue));
    }
}