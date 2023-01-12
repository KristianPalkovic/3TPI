package sk.sosholic.prvypolrok.pracasostring;

public class Dom {
    private String farbaFasady;
    private boolean maKomin;
    private int pocetOkien;
    private int pocetIzieb;
    private boolean maSklep;

    public Dom(String farbaFasady, boolean maKomin, int pocetOkien, int pocetIzieb, boolean maSklep) {
        this.farbaFasady = farbaFasady;
        this.maKomin = maKomin;
        this.pocetOkien = pocetOkien;
        this.pocetIzieb = pocetIzieb;
        this.maSklep = maSklep;
    }

    public String getFarbaFasady() {
        return farbaFasady;
    }

    public void setFarbaFasady(String farbaFasady) {
        this.farbaFasady = farbaFasady;
    }

    public boolean getMaKomin() {
        return maKomin;
    }

    public void setMaKomin(boolean maKomin) {
        this.maKomin = maKomin;
    }

    public int getPocetOkien() {
        return pocetOkien;
    }

    public void setPocetOkien(int pocetOkien) {
        this.pocetOkien = pocetOkien;
    }

    public int getPocetIzieb() {
        return pocetIzieb;
    }

    public void setPocetIzieb(int pocetIzieb) {
        this.pocetIzieb = pocetIzieb;
    }

    public boolean getMaSklep() {
        return maSklep;
    }

    public void setMaSklep(boolean maSklep) {
        this.maSklep = maSklep;
    }
}
