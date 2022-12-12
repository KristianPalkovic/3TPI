package sk.sosholic.prvypolrok.zoo;
import java.util.List;
import java.util.ArrayList;

public class Chovatel {
    List<Zviera> zoo = new ArrayList<>();
    String menoPriezvisko;

    public Chovatel(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }

    public void pridatZviera(Zviera zviera){
      zoo.add(zviera);
    }

    public Zviera zistiNajdrahsieZviera(){
            Zviera najdrahsieZviera = zoo.get(0);
        for(Zviera zvieraCyklus: zoo){
            if(zvieraCyklus.getValue() > najdrahsieZviera.getValue()){
                najdrahsieZviera = zvieraCyklus;
            }else{
            }
        }
        return najdrahsieZviera;
    }
}