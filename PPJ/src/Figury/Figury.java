package Figury;

public class Figury {

        static void diamond(int rozmiar) {
            int rogi = rozmiar / 2;
            for (int i = 0; i < rozmiar; i++) {
                for (int j = 0; j < rozmiar; j++) {
                    if (!((i + j < rogi) || (i + j >= rozmiar + rogi) || (i - j > rogi) || (i - j <= rogi - rozmiar))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
    }
    static void cross(int rozmiar){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if ( i==j || rozmiar-1 == i+j){
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    static void kordy(int rozmiar){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                System.out.print("[ " + i + "," + j + "]");
            }
            System.out.println( );

        }
    }
    static void klepsydra(int rozmiar){
            int rogi = rozmiar /2;
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (j>=i){
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

    }

}
    static void squer(int rozmiar){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i==1||j==1 || j==rozmiar || i==rozmiar){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
