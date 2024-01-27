package Rachunek;

public class KontoVIP extends Konto{
    double limitDebetu = (-100);

    public KontoVIP(Osoba wlasciciel, double stan, double oprocentowanie, double limitDebetu) {
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu = limitDebetu;
    }

    public double getLimitDebetu() {
        return limitDebetu;
    }
}
