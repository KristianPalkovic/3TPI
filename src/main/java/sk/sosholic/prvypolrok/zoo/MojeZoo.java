package sk.sosholic.prvypolrok.zoo;
import sk.sosholic.prvypolrok.databazaziakov.Ziak;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MojeZoo {
    public static void main(String[] args) {
        String menoZoo;
        Chovatel mojChovatel;

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Zadaj meno Zoo: ");
        menoZoo = scanner.nextLine();
        System.out.println("Zadaj meno Chovatela: ");
        String menoChovatela = scanner.nextLine();
        mojChovatel = new Chovatel(menoChovatela);
        Zviera zviera = new Zviera("Lev",1000);
        Zviera zviera2 = new Zviera("slimak",20);
        mojChovatel.pridatZviera(zviera);
        mojChovatel.pridatZviera(zviera2);
        mojChovatel.pridatZviera(new Zviera("kon", 13000));
        mojChovatel.pridatZviera(new Zviera("sakal", 200));
        while (!exit) {
            System.out.println("*****************************");
            System.out.println("0. Zobrazit meno Zoo");
            System.out.println("1. Zobrazit meno Chovatela");
            System.out.println("2. Pridat zviera");
            System.out.println("3. Zobrazit zoznam zvierat");
            System.out.println("4. Zobrazit najdahsie zviera");
            System.out.println("5. Ukoncit program");
            System.out.println("*****************************");
            System.out.println("Zadaj moznost: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Meno Zoo je " + menoZoo);
                    break;
                case 1:
                    System.out.println("Meno Chovatela je " + menoChovatela);
                    break;
                case 2:
                    System.out.println("Zadaj Meno Zvierata: ");
                    String meno = scanner.nextLine();
                    System.out.println("Zadaj Cenu Zvierata: ");
                    double cena = scanner.nextDouble();
                    mojChovatel.pridatZviera(new Zviera(meno,cena));
                    break;
                case 3:
                    System.out.println("Zoznam zvierat v zoo je: ");
                    System.out.println(mojChovatel.getZoo());
                    break;
                case 4:
                    System.out.println(mojChovatel.zistiNajdrahsieZviera().toString());
                    break;
                case 5:
                    exit = true;
                    System.out.println("Aplikacia sa vypina");
                    break;
            }
        }
    }
}