package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("zadaj meno a stlac enter: ");
        String meno = scanner.nextLine();
        System.out.println("zadaj priezvisko a stlac enter: ");
        String priezvisko = scanner.nextLine();

        //dopln zbytok tak aby program vyzadoval zadanie mena a priezviska od konzoly

        MojeMeno mojeMeno = new MojeMeno(meno, "Palkovic");

        for (int x = 1; x <=10 ; x++){
            //System.out.println("Kristian Palkovic" + x);
            if(x%2==0)
                System.out.println(mojeMeno.getCeleMeno() + " " +x);
        }
    }
}
