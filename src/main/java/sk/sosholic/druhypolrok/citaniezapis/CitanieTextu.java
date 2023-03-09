package sk.sosholic.druhypolrok.citaniezapis;
import java.io.*;
import java.util.Scanner;

public class CitanieTextu {
    public static void main(String[] args) {
        //myFileReader("text.txt");
        //myFileReader("osoba1.txt");
        myBufferedFileReader("text.txt");
    }

    public static void myFileReader(String cestaKSuboru){
        try{
            FileReader fileReader =  new FileReader(cestaKSuboru);
            int  a = fileReader.read();
            System.out.println("cislo je: " + a);
            char b = (char) a;
            System.out.println("char je: " + b);

            int pocetRiadkov = 0;
            int nejakyInt = 0;
            while(nejakyInt != -1){
                nejakyInt = fileReader.read();
                if(nejakyInt == '\n' || nejakyInt == -1){
                    pocetRiadkov++;
                }
                if(nejakyInt > -1){
                    System.out.print((char)nejakyInt);
                }
            }
            fileReader.close();
            System.out.println("\n pocet riadkov je: " + pocetRiadkov);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void myBufferedFileReader(String cestaKSuboru){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cestaKSuboru));
            String riadok = "";
            while (riadok != null){
                riadok = bufferedReader.readLine();
                System.out.println(riadok);
            }
                bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void readWithScanner(String cestaKSuboru){
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File(cestaKSuboru));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}