package sk.sosholic.prvypolrok.opakovanie;
import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("zadaj volaco a stlac enter: ");
        System.out.println(scanner.nextLine());

        String ulozenyRiadok = scanner.nextLine();
        int ulozenyRiadok1= scanner.nextInt();
            scanner.next();
            scanner.nextBoolean();
        System.out.println(ulozenyRiadok);*/


        int exit = 1;
        while(exit!=0) {

            System.out.println("Toto je moj prvy program s nazvom Kalkulacka. ");
            System.out.println("Tento program scitava dve zadane cisla");
            System.out.print("Zadaj prve cislo a stlac enter: ");
            int scitanec1 = scanner.nextInt();
            System.out.print("Zadaj druhe cislo a stlac enter:");
            int scitanec2 = scanner.nextInt();
            System.out.println("Vysledok scitania je: " + (scitanec1 + scitanec2));
            System.out.println("Ukoncenie programu stlac 0 a enter. Pre pokracovanie stlac 1");
            exit = scanner.nextInt();
            String out = scanner.nextLine();
        }
    }
}