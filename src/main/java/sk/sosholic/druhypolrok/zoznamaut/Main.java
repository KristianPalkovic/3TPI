package sk.sosholic.druhypolrok.zoznamaut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            nacitatAutomobil("automobily.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static List<Automobil> nacitatAutomobil(String subor) throws IOException{
        List<Automobil> auta= new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(subor));
            String line = "";
        while (line != null){
            line = bufferedReader.readLine();
            if(line != null){
                String[] mojePole = line.split(",");
                Automobil automobil = new Automobil(mojePole[0], mojePole[1], mojePole[2]);
                auta.add(automobil);
            }
            System.out.println(line);
        }
        bufferedReader.close();
        return auta;
    }
}