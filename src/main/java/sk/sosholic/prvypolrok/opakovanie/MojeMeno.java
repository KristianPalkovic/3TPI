package sk.sosholic.prvypolrok.opakovanie;

public class MojeMeno {
    String meno;
    String priezvisko;

    public MojeMeno(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public String getCeleMeno() {
        //return meno + " " + priezvisko;
        return getMeno() + " " + getPriezvisko();
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
}