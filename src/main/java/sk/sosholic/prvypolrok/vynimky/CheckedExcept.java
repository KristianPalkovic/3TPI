package sk.sosholic.prvypolrok.vynimky;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class CheckedExcept {
    public static void main(String[] args) {

    }
    public static void nacitatSubor(){
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader("text.txt"));
        }catch(FileNotFoundException exception){
            System.out.println("Subor nenajdeny, zadaj spravnu cestu suboru");
        }
        try{
            bufferedReader.readLine();
        }catch(IOException exe){
            System.out.println("nejaka chyba IOException");
        }
    }

    public static void uloha1(){
        SQLException sqlException = new SQLException("nejaka sql chyba");
        try{
            throw sqlException;
        }catch(SQLException exception){
            System.out.println("SQL problem");
        }
    }

    public static void uloha2(){
        URL url = null;
        try{
            url = new URL("http://localhost");
        }catch(MalformedURLException exception){
            System.out.println("zla url adresa");
        }

        URLConnection connection = null;
        try{
            connection = url.openConnection();
            connection.connect();
        }catch(IOException exception){
            System.out.println("chyba zapisu");
        }

        // pokial je obsluzny program chyby identicky, mozme zlucit try catch do jedneho.
        /*try{
            connection.connect();
        }catch(IOException exception){
            System.out.println("chyba pripojenia");
        }*/
    }
    //throws deleguje riesenie ynimky
}