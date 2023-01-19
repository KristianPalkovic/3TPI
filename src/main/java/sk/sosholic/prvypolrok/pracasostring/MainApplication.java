package sk.sosholic.prvypolrok.pracasostring;

public class MainApplication {
    public static void main(String[] args) {
        Kniha kniha = new Kniha("J.R.R. Tolkien", "Pan Prstenov", 350);
        System.out.println("nazov knihy je: " + kniha.getNazovKnihy());

        Auto pussyVagon = new Auto("",4, true);
        System.out.println("nazov auta je: " + pussyVagon.getZnacka());

        Strom mojStrom = new Strom("Smrek",false, 600, 70);
        System.out.println("nazov stromu je: " + mojStrom.getNazovStromu());

        Dom mojDom = new Dom("cervena", true, 10, 6, false);
        System.out.println("farba domu je: " + mojDom.getFarbaFasady());

        Osoba clovek = new Osoba("Ferdinand", "Ostry", 23);
        System.out.println("meno osoby je: " + clovek.getMeno());

        Telefon mobil = new Telefon("Samsung", false, true, 15, 6, 1);
        System.out.println("nazov telefonu je: " + mobil.getNazov());
    }
}