package sk.sosholic.prvypolrok.databazaziakov;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikaciaMojejDatabazy {
    static List<Ziak> ziaklist= new ArrayList<>();
    private static boolean exit = false;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
            System.out.println("Zadaj moznost: ");
            int menu = scanner.nextInt();
            switch (menu){
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
                    Ziak ziak = new Ziak(vek,meno,priezvisko);
                    ziaklist.add(ziak);
                    break;
                case 2:
                    vypisList();
                    System.out.println("Vyber cislo ziaka ktoreho chces zmazat");
                    /*if(){
                        System.out.println();
                    }else{
                        System.out.println();
                    }*/
                    int menoNaZmatanie=scanner.nextInt();
                    //ziakList.remove(menoNaZmatanie-1);
                    /*try{
                        int menoNaZmatanie=scanner.nextInt();
                        ziakList.remove(menoNaZmatanie-1);
                    }catch(Exception ex){
                    System.out.println(" chyba clen nezmazany" + ex.getMessage());
                    }
                    break;*/
                case 4:
                    System.out.println(ziaklist.toString());
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
        ziaklist.add(new Ziak(22, "Roman", "Vodovy"));
        ziaklist.add(new Ziak(25, "Dalibor", "Chabr"));
        ziaklist.add(new Ziak(26, "Erik", "Dravy"));
        ziaklist.add(new Ziak(30, "Viliam", "Vysoky"));
    }
    private static void vypisList(){
        /*for(int i =1, i<=ziakList.size(); i++){}
        System.out.println(i+". " + ziaklist.get(i-1));

        System.out.println(ziaklist.toString().replace(",", "\n"));*/
    }
}