package Rachunek;

public class Konto extends RachunekBankowy{
    double oprocentowanie;

    public Konto(Osoba wlasciciel, double stan, double oprocentowanie) {
        super(wlasciciel, stan);
        this.oprocentowanie = oprocentowanie;
    }
}
