package sk.sosholic.druhypolrok.stromy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainStromy {
    public static void main(String[] args) {
        try{
            nacitatStrom("stromy.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static List<Strom> nacitatStrom(String subor1) throws IOException{
        List<Strom> stromek= new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(subor1));
        String line = "";
        while (line != null){
            line = bufferedReader.readLine();
            if(line != null){
                String[] mojePole = line.split(",");
                Strom stromy = new Strom(mojePole[0], mojePole[1], mojePole[2], mojePole[3]);
                stromek.add(stromy);
            }
            System.out.println(line);
        }
        bufferedReader.close();
        return stromek;
    }
}