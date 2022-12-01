package sk.sosholic.prvypolrok.zoo;

public class Hmyz extends Zviera{
    int pocetNoh;

    public Hmyz(String animalType, double value, int pocetNoh) {
        super(animalType, value);
        this.pocetNoh = pocetNoh;
    }
    int checkPocetNoh(int pocetNoh){
        if(pocetNoh == 0 || pocetNoh == 6 || pocetNoh == 8 || pocetNoh == 100){
            return pocetNoh;
        }else{
            return -1;
        }
    }

    public int getPocetNoh() {
        return pocetNoh;
    }

    public void setPocetNoh(int pocetNoh) {
        this.pocetNoh = pocetNoh;
    }

    @Override
    public String toString() {
        return "Hmyz{" +
                "pocetNoh=" + pocetNoh +
                '}';
    }
}