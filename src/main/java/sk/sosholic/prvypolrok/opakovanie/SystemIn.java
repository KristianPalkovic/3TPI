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


        /*int exit = 1;
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
        }*/

        int exit1 = 1;
        while(exit1!=0) {
            System.out.println("Ak chces scitat stlac 1 ");
            System.out.println("Ak chces odcitat stlac 2 ");
            System.out.println("Ak chces nasobit stlac 3 ");
            System.out.println("Ak chces delit stlac 4 ");
            int matematickaOperacia = scanner.nextInt();
           switch (matematickaOperacia){
               case 1:
                   System.out.print("Zadaj prve cislo a stlac enter: ");
                   int scitanec1 = scanner.nextInt();
                   System.out.print("Zadaj druhe cislo a stlac enter:");
                   int scitanec2 = scanner.nextInt();
                   System.out.println("Vysledok scitania je: " + (scitanec1 + scitanec2));
                   break;
               case 2:
                   System.out.print("Zadaj prve cislo a stlac enter: ");
                   int scitanec3 = scanner.nextInt();
                   System.out.print("Zadaj druhe cislo a stlac enter:");
                   int scitanec4 = scanner.nextInt();
                   System.out.println("Vysledok odcitania je: " + (scitanec3 - scitanec4));
                   break;
               case 3:
                   System.out.print("Zadaj prve cislo a stlac enter: ");
                   int scitanec5 = scanner.nextInt();
                   System.out.print("Zadaj druhe cislo a stlac enter:");
                   int scitanec6 = scanner.nextInt();
                   System.out.println("Vysledok nasobenia je: " + (scitanec5 * scitanec6));
                   break;
               case 4:
                   System.out.print("Zadaj prve cislo a stlac enter: ");
                   int scitanec7 = scanner.nextInt();
                   System.out.print("Zadaj druhe cislo a stlac enter:");
                   int scitanec8 = scanner.nextInt();
                   System.out.println("Vysledok delenia je: " + (scitanec7 / scitanec8));
                   break;
           }
        }

    }
}