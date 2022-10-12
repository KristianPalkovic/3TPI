package sk.sosholic.prvypolrok.databazaziakov;

public class Ziak {
    private int vek;
    private String meno;
    private String priezvisko;


    public Ziak(int vek, String meno, String priezvisko) {
        this.vek=vek;
        this.meno=meno;
        this.priezvisko=priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
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

    @Override
    public String toString() {
        return "Ziak{" +
                "vek=" + vek +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                '}';
    }
}