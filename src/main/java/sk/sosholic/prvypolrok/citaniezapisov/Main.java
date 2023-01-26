package sk.sosholic.prvypolrok.citaniezapisov;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("nejakySubor.txt");
        file.write("moje meno je " + System.getProperty("user.name"));
        file.close();

        /*BufferedWriter writer = new BufferedWritter(new FileWriter("test.txt"));

         */
    }
}