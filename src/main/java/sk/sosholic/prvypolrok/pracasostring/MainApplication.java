package sk.sosholic.prvypolrok.pracasostring;

public class MainApplication {
    public static void main(String[] args) {
        Kniha kniha = new Kniha();
        kniha.autor= "J.R.R. Tolkien";
        String tolkien = kniha.autor;

        /*Osoba ondrej = new Osoba("Ondrej", "Novák", 55);
        char samohlaska = 'a';
        System.out.println("samohlaska " + samohlaska + " sa nachadza v priezvisku "
                + ondrej.pocetSamohlaskyVPriezvisku(samohlaska) + " krat.");*/
    }
}