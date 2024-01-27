package Rachunek;

public class RachunekBankowy{
    Osoba wlasciciel;
    double stan;

    KontoVIP limitDebetu;
    RachunekBankowy(Osoba wlasciciel, double stan){
        this.wlasciciel = wlasciciel;
        this.stan = stan;
    }
    void wplata(double kwota){
        System.out.println(this.wlasciciel.getImie()  + " Dokonujesz wpłaty: " + kwota);
        this.stan += kwota;
        System.out.println("twój stan konta po przeprowadzeniu operacji to: " + this.stan);

    }
    void wyplata(double kwota){
        System.out.println("Dokonujesz wyplaty: " + kwota);
        if ((this.stan-kwota)>= this.limitDebetu.getLimitDebetu()){
            this.stan -= kwota;
        } else {
            System.out.println("Nie możesz wykonać wypłaty twój stan konta jest nie wystarczający");
        }
        System.out.println("twój stan konta po przeprowadzeniu operacji to: " + this.stan);

    }
    void przelew( RachunekBankowy wlasciciel, double kwota){
        if ((this.stan-kwota)>= this.limitDebetu.getLimitDebetu() ){
            this.stan -= kwota;
            wlasciciel.wplata(kwota);
            System.out.println("Dokonałeś przelewu do: " + wlasciciel + "na kwote: " + kwota );
        } else {
            System.out.println("Nie możesz wykonać przelewu, Twój stan konta jest nie wystarczający");
        }

    }

    @Override
    public String toString() {
        return "RachunekBankowy{" +
                "wlasciciel=" + this.wlasciciel.getImie() +
                ", stan=" + this.stan + "LimitDebetu: " +
                "this.limitDebetu.getLimitDebetu()" +
                '}';
    }
}
