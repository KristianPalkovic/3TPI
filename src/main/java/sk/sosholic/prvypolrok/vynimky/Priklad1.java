package sk.sosholic.prvypolrok.vynimky;
import java.io.BufferedInputStream;
import java.io.File;

public class Priklad1 {
    public static void main(String[] args) throws Exception {
        try{
            System.out.println("Nejaky beh programu");
            throw new Exception("Toto je nejaka chyba !!!");
        }
        catch (Exception ex){
            System.out.println(" toto sa nestane ked je chyba a bezi kod v case { }");
        }
        finally {
            System.out.println("tento kod sa vykona vzdy nezavisle od chyby");
        }
        //System.out.println("toto nikdy nenastane !!!");
        System.out.println("toto je pokracovanie kodu");
    }
}