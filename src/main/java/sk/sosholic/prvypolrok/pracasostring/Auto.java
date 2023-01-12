package sk.sosholic.prvypolrok.pracasostring;

public class Auto {
    private String znacka;
    private int pocetDveri;
    private boolean jeNastartovane;

    public Auto(String znacka, int pocetDveri, boolean jeNastartovane) {
        this.znacka = znacka;
        this.pocetDveri = pocetDveri;
        this.jeNastartovane = jeNastartovane;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    public boolean getJeNastartovane() {
        return jeNastartovane;
    }

    public void setJeNastartovane(boolean jeNastartovane) {
        this.jeNastartovane = jeNastartovane;
    }
}