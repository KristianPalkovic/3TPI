package sk.sosholic.prvypolrok.pracasostring;

public class Kniha {
    String autor;
    String nazovKnihy;
    int pocetStran;

    public Kniha(String autor, String nazovKnihy, int pocetStran){
        this.autor = autor;
        this.nazovKnihy = nazovKnihy;
        this.pocetStran = pocetStran;
    }

    public Kniha() {

    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}

