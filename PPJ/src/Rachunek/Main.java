package Rachunek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba ksawer = new Osoba("Ksawer", "Grzybek", 20);
        Osoba aga = new Osoba("Aga", "TA", 21);
        RachunekBankowy rach1 = new RachunekBankowy(ksawer, 2000);
        RachunekBankowy rach2 = new RachunekBankowy(aga, 2000);

        System.out.println("----------------------------------------------");


        System.out.println("----------------------------------------------");


        System.out.println(rach1.toString());


        System.out.println("----------------------------------------------");


        System.out.println("----------------------------------------------");
    }
}