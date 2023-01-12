package sk.sosholic.prvypolrok.pracasostring;

public class Strom {
    private String nazovStromu;
    private boolean jeListnaty;
    private int vyskaStromu;
    private int obvodPna;

    public Strom(String nazovStromu, boolean jeListnaty, int vyskaStromu, int obvodPna) {
        this.nazovStromu = nazovStromu;
        this.jeListnaty = jeListnaty;
        this.vyskaStromu = vyskaStromu;
        this.obvodPna = obvodPna;
    }

    public String getNazovStromu() {
        return nazovStromu;
    }

    public void setNazovStromu(String nazovStromu) {
        this.nazovStromu = nazovStromu;
    }

    public boolean getJeListnaty() {
        return jeListnaty;
    }

    public void setJeListnaty(boolean jeListnaty) {
        this.jeListnaty = jeListnaty;
    }

    public int getVyskaStromu() {
        return vyskaStromu;
    }

    public void setVyskaStromu(int vyskaStromu) {
        this.vyskaStromu = vyskaStromu;
    }

    public int getObvodPna() {
        return obvodPna;
    }

    public void setObvodPna(int obvodPna) {
        this.obvodPna = obvodPna;
    }
}
