package sk.sosholic.prvypolrok.pracasostring;

public class Telefon {
    private String nazov;
    private boolean jeZapnuty;
    private boolean jeDotykovy;
    private int vyska;
    private int sirka;
    private int hlbka;

    public Telefon(String nazov, boolean jeZapnuty, boolean jeDotykovy, int vyska, int sirka, int hlbka) {
        if (nazov.length() == 0) {
            this.nazov =("zakladny nazov");
        }else{
            this.nazov = nazov;
        }
        this.jeZapnuty = jeZapnuty;
        this.jeDotykovy = jeDotykovy;
        this.vyska = vyska;
        this.sirka = sirka;
        this.hlbka = hlbka;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public boolean getJeZapnuty() {
        return jeZapnuty;
    }

    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public boolean getJeDotykovy() {
        return jeDotykovy;
    }

    public void setJeDotykovy(boolean jeDotykovy) {
        this.jeDotykovy = jeDotykovy;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getHlbka() {
        return hlbka;
    }

    public void setHlbka(int hlbka) {
        this.hlbka = hlbka;
    }
}
