package Rachunek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba przemek = new Osoba("Przemek", "Molenda", 20);
        Osoba janek = new Osoba("Janek", "Paterek", 21);
        RachunekBankowy konto1 = new RachunekBankowy(przemek, 2000);
        RachunekBankowy konto2 = new RachunekBankowy(janek, 2000);
        System.out.println(konto1);
        konto1.wplata(200);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");


        konto2.przelew(konto1,600);


        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");



        System.out.println("Stany konta");
        System.out.println(konto1.toString());



        System.out.println("----------------------------------------------");


        System.out.println(konto2.toString());



        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

    }
}