package sk.sosholic.prvypolrok.opakovanie;

import java.io.FileWriter;
import java.io.IOException;

public class MojeStringy {
    public static void main(String[] args) throws IOException {
        String meno = "Fera";
        String priezvisko = "Britva";
        Osoba danaOsoba;

        //vytvorite dalsi string menoPriezvisko, potom String MENOPRIEZVISKO, string menopriezvisko
        //a premenu ktora uchova pocet znakov vasho celeho mena
        //vsetko vypiseme do konzoly a to tak ze premenne pouzijete vo vetach

        String menoPriezvisko = meno.toLowerCase() + " " + priezvisko.toUpperCase();
        String MENOPRIEZVISKO = menoPriezvisko.toUpperCase();
        String menopriezvisko = menoPriezvisko.toLowerCase();
        String Menopriezvisko = meno.toUpperCase() + " " + priezvisko.toLowerCase();
        int pocetZnakov = menoPriezvisko.length();

        System.out.println("Velke meno s malým priezviskem: " + Menopriezvisko); //Velke meno, male priezvisko
        System.out.println("Velke meno s velkymi pismenami je : " + MENOPRIEZVISKO); //Vseto Velke
        System.out.println("Male meno s Malými pismenami je  " + menopriezvisko); //Vsetko Male
        System.out.println("Malé meno a Veľké priezvisko je : " + menoPriezvisko); //Male meno, velke priezvisko
        System.out.println("Pocet znakov v mene je: " + pocetZnakov);

       danaOsoba = new Osoba("Jiří", "Král");
       System.out.println(danaOsoba.velkePismena());

       danaOsoba = new Osoba("Ivan", "Bartoš");
       System.out.println(danaOsoba.malePismena());

       danaOsoba = new Osoba("Štela", "Kunštapa");
       System.out.println(danaOsoba.celeMeno());

       danaOsoba = new Osoba("Kamil", "Ostrý");
       System.out.println(danaOsoba.pocetZnakov);

       FileWriter file = new FileWriter("osoba1.txt");
       file.write("Súbor: \n"+"Velke meno s velkymi pismenami je: "+danaOsoba.velkePismena() +"\n"+
               "Male meno s Malými pismenami je: "+danaOsoba.malePismena()+"\n"+"Celé Meno: "+danaOsoba.celeMeno()+"\n"+
               "Pocet znakov v mene je: " +danaOsoba.pocetZnakov);
       file.close();

       FileWriter fw = new FileWriter("osoba2.txt", true);
       fw.write("Moje meno je: "+ danaOsoba.getMeno());
       fw.write("Moje meno s velkymi pismenami je:"+danaOsoba.velkePismena());
       fw.write("Moje meno s malými pismenami je:"+danaOsoba.malePismena());
       fw.close();
    }
}