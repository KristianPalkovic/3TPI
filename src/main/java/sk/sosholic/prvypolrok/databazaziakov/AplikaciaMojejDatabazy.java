package sk.sosholic.prvypolrok.databazaziakov;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikaciaMojejDatabazy {
    static List<Ziak> ziaklist= new ArrayList<>();
    private static boolean exit = false;
    private static Scanner scanner = new Scanner(System.in);

    public AplikaciaMojejDatabazy(){
    }

    public static void main(String[] args) throws IOException {
        ziaci();
        vypisList();
        //System.out.println(ziaklist.toString());
        System.out.println(" Moja databaza spoluziakov ");
        while(!exit){
            System.out.println("ak chces ukoncit aplikaciu stlac 0");
            System.out.println("ak chces vytvorit zaznam stlac 1");
            System.out.println("ak chces zmazat zaznam stlac 2");
            System.out.println("ak chces zobrazit zaznam stlac 3");
            System.out.println("ak chces zobrazit CELY zoznam stlac 4");
            System.out.println("ak chces zobrazit najstarsieho ziaka stlac 5");
            System.out.println("ak chces vypisat zoznam ziakov do textoveho dokumentu stlac 6");
            System.out.println("Zadaj moznost: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    exit = true;
                    System.out.println("Aplikacia sa vypina");
                    break;
                case 1:
                    System.out.println("Zadaj meno: ");
                    String meno = scanner.next();
                    System.out.println("Meno je: " + meno);
                    System.out.println("Zadaj priezvisko: ");
                    String priezvisko = scanner.next();
                    System.out.println("Priezvisko je: " + priezvisko);
                    System.out.println("Zadaj vek: ");
                    int vek = scanner.nextInt();
                    Ziak ziak = new Ziak(vek, meno, priezvisko);
                    ziaklist.add(ziak);
                    break;
                case 2:
                    vypisList();
                    System.out.println("Vyber cislo ziaka ktoreho chces zmazat");
                    int menoNaZmazanie = scanner.nextInt();
                    ziaklist.remove(menoNaZmazanie - 1);
                    /*try{
                        int menoNaZmazanie=scanner.nextInt();
                        ziaklist.remove(menoNaZmazanie-1);
                    }catch (Exception ex){
                    System.out.println(" chyba clen nezmazany" + ex.getMessage());
                    scanner.nextLine();
                    }*/
                    break;
                case 3:
                    System.out.println("Zadaj poradie ziaka na zobrazenie: ");
                    int cislo = scanner.nextInt();
                    if (cislo > ziaklist.size()) {
                        System.out.println("Cislo je mimo rozsah");
                    } else if (cislo < 0) {
                        System.out.println("Cislo je mimo rozsah");
                    } else {
                        Ziak ziakNaZobrazenie = ziaklist.get(cislo - 1);
                        System.out.println("ziak na poradí " + "je " + ziakNaZobrazenie);
                    }
                    break;
                case 4:
                    System.out.println(ziaklist.toString());
                    break;
                case 5:
                    int poradie = 0;
                    for (int i = 0; i < ziaklist.size(); i++) {
                        Ziak ziak1 = ziaklist.get(i);
                        if (ziaklist.get(poradie).getVek() < ziak1.getVek()) {
                            poradie = i;
                        }
                    }
                    System.out.println("Ziak s najvacsim vekom je " + ziaklist.get(poradie));
                case 6:
                    FileWriter subor1 = new FileWriter("Zoznam Ziakov.txt");
                    subor1.write("Zoznam Ziakov: \n");
                    String Ziak = "";
                    for (sk.sosholic.prvypolrok.databazaziakov.Ziak s : ziaklist) {
                      //Ziak += s + "\n";
                        subor1.write(s+ "\n");
                    }
                  //String zapisDoSuboru = "Zoznam Žiakov: \n" + Ziak;
                  //subor1.write(zapisDoSuboru);
                    subor1.close();
                    System.out.println("Zapísaný zoznam ziakov");
            }
        }
    }
    private static void ziaci(){
        ziaklist.add(new Ziak(15, "Ferdinand", "Pele"));
        ziaklist.add(new Ziak(17, "Jana", "Fialova"));
        ziaklist.add(new Ziak(20, "Miloš", "Mrkva"));
        ziaklist.add(new Ziak(16, "Pista", "Ostry"));
        ziaklist.add(new Ziak(18, "Ignac", "Kunstapa"));
        ziaklist.add(new Ziak(21, "Juraj", "Rene"));
        ziaklist.add(new Ziak(15, "Roman", "Vodovy"));
        ziaklist.add(new Ziak(20, "Dalibor", "Chabr"));
        ziaklist.add(new Ziak(17, "Erik", "Dravy"));
        ziaklist.add(new Ziak(19, "Viliam", "Vysoky"));

    }

    private static void vypisList(){
        /*for(int i =1, i<=ziaklist.size(); i++){}
        System.out.println(i+". " + ziaklist.get(i-1));

        System.out.println(ziaklist.toString().replace(",", "\n"));*/
    }
}