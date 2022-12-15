package sk.sosholic.prvypolrok.zoo;
import sk.sosholic.prvypolrok.databazaziakov.Ziak;

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
        while (!exit) {
            System.out.println("ak chces zobrazit meno Zoo stlac 0");
            System.out.println("ak chces zobrazit meno Chovatela stlac 1");
            System.out.println("ak chces pridat zviera stlac 2");
            System.out.println("ak chces zobrazit zaznam stlac 3");
            System.out.println("ak chces zobrazit najdahsie zviera stlac 4");
            System.out.println("ak chces ukoncit program stlac 5");
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
                    Zviera zviera1 = new Zviera("Lev",1000);
                    List<Zviera> zoo = new ArrayList<>();
                    zoo.add(zviera1);
                    break;
                case 3:
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