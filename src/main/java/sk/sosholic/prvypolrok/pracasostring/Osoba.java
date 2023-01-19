package sk.sosholic.prvypolrok.pracasostring;

public class Osoba {
    String meno;
    String priezvisko;
    int vek;

    public Osoba(String meno, String priezvisko, int vek) {
        if (meno.length() == 0) {
            this.meno =("zakladny nazov");
        }else{
            this.meno = meno;
        }
        this.priezvisko = priezvisko;
        this.vek = vek;
    }


    public int pocetSamohlaskyVPriezvisku(char samohlaska){
        int pocet = 0;
        for(int i = 0; i<priezvisko.length(); i++){
            if(priezvisko.charAt(i)==samohlaska){
                pocet++;
            }
        }
        return pocet;
    }

    public int pocetSamohlaskyVPriezvisku(){
        int pocet =0;
        //String mozeme zapisat ako aj pole char
        // jak mame pole mozeme pouzit cyklus na najdenie dannej samohlasky
        for(int i=0; i<priezvisko.length(); i++){
            if(priezvisko.charAt(i)=='a'||priezvisko.charAt(i)=='e'||priezvisko.charAt(i)=='i'||
            priezvisko.charAt(i)=='o'||priezvisko.charAt(i)=='u'||priezvisko.charAt(i)=='y'){
                pocet++;
            }
        }
        return pocet;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }
}
