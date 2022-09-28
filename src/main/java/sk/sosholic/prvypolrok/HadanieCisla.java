package sk.sosholic.prvypolrok;
import java.util.Random;
import java.util.Scanner;

public class HadanieCisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyber si rozsah cisiel");
        System.out.println("Prve cislo od: ");
        int low1 = scanner.nextInt();
        System.out.println("Druhe cislo do: ");
        int high1 = scanner.nextInt();

        Random r = new Random();
        int low = low1;
        int high = high1;
        int cisloKtoreTrebaUhadnut = r.nextInt(high - low) + low;

        //System.out.println("Toto je hra na hladanie cisla od 1 do 20");
        //System.out.println("Mas 10 pokusov");
        System.out.println("Vyber si kolko chces mat pocet pokusov: ");
        int pokusy = scanner.nextInt();
        int i = 0;
        while (i < pokusy){
            System.out.println("zadaj cislo: ");
            int cislo = scanner.nextInt();
            System.out.println("zadane cislo je: " + cislo);
            boolean x = cislo<cisloKtoreTrebaUhadnut;
            if(cislo>cisloKtoreTrebaUhadnut){
                System.out.println("Zadane cislo " + cislo + " je vacsie");
            }else if(x){
                System.out.println("Zadane cislo " + cislo + " je mensie");
            }else{
                System.out.println("Zadane cislo " + cislo + " sa rovna");
            }
            i++;
        }
    }
}