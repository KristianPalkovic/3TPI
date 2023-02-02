package sk.sosholic.druhypolrok.citaniezapis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DalsiMain {
    String meno;
    String priezvisko;

    public DalsiMain(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public static void main(String[] args) throws IOException {
        String textNaZapis = "Tu je text na zapis";

        // zapiste text do suboru s nazvom OpakovanieZapisu.txt
        // aplikaciu spustite s najprv bez pouzitia metody close() a s nou
        // vytvorite novy objekt FileWriter a zapiste dalsi string vasho uvazenia
        // do isteho suboru pouzite konstruktor s dvomi atributami.

        FileWriter subor1 = new FileWriter("OpakovanieZapisu.txt");
        subor1.write(textNaZapis);
        subor1.close();
        //nie je mozne datovy tok je uz uzavrety
        //subor1.write("volaco test");
        //subor1.close();
        FileWriter subor2 = new FileWriter("OpakovanieZapisu.txt", true);
        String zapisDoSuboru2 = "tu zapiseme nieco dalsieho \n" + "test" ;
        subor2.write("\n");
        subor2.write(zapisDoSuboru2);
        subor2.close();

        FileWriter fileWriter = new FileWriter("text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("vlozeny text \n" + "medzera a text");
            bufferedWriter.close();
    }
}