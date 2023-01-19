package sk.sosholic.prvypolrok.pracasostring;

public class Kniha {
    String autor;
    String nazovKnihy;
    int pocetStran;

    public Kniha(String autor, String nazovKnihy, int pocetStran){
        this.autor = autor;
        if (nazovKnihy.length() == 0) {
            this.nazovKnihy =("zakladny nazov");
        }else{
            this.nazovKnihy = nazovKnihy;
        }
        this.pocetStran = pocetStran;
    }

    public Kniha() {

    }

    public String getNazovKnihy() {
        return nazovKnihy;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setNazovKnihy(String nazovKnihy) {
        this.nazovKnihy = nazovKnihy;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}