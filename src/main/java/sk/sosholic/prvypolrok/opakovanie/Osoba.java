package sk.sosholic.prvypolrok.opakovanie;

public class Osoba {
    String meno;
    String priezvisko;
    int pocetZnakov;

    public Osoba(String meno, String priezvisko){
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pocetZnakov = menoPriezvisko().length();
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getPocetZnakov() {
        return pocetZnakov;
    }


    public String menoPriezvisko(){
        String menoPriezvisko = meno + " " + priezvisko;
        return menoPriezvisko;
    }
    public String velkePismena(){
        String MENOPRIEZVISKO = menoPriezvisko().toUpperCase();
        return MENOPRIEZVISKO;
    }

    public String malePismena(){
        String menopriezvisko = menoPriezvisko().toLowerCase();
        return menopriezvisko;
    }

     public String celeMeno(){
        String menoPriezvisko = meno + " " + priezvisko ;
        return menoPriezvisko;
    }
    public int pocetZnakov(){
        int pocetZnakov = menoPriezvisko().length();
        return pocetZnakov;
    }
}