package sk.sosholic.prvypolrok.opakovanie;
import java.util.Scanner;
public class CusNe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("zadaj menoa stlac enter: ");
        String meno = scanner.nextLine();

        //dopln zbytok tak aby program vyzadoval zadanie mena a priezviska od konzoli

        MojeMeno mojeMeno = new MojeMeno("Kristian", "Palkovic");

        for (int x = 1; x <=10 ; x++){
            System.out.println("Kristian Palkovic" + x);
            if(x%2==0)
            System.out.println(mojeMeno.getCeleMeno() + " " +x);
        }
    }
}