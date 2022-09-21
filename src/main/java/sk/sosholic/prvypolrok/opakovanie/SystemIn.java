package sk.sosholic.prvypolrok.opakovanie;
import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj volaco a stlac enter: ");
        System.out.println(scanner.nextLine());
    }
}