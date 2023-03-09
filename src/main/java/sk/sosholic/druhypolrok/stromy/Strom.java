package sk.sosholic.druhypolrok.stromy;

public class Strom {
    private String nazov;
    private String typListu;
    private String vyska;
    private String plod;

    public Strom(String nazov, String typListu, String vyska, String plod) {
        this.nazov = nazov;
        this.typListu = typListu;
        this.vyska = vyska;
        this.plod = plod;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getTypListu() {
        return typListu;
    }

    public void setTypListu(String typListu) {
        this.typListu = typListu;
    }

    public String getVyska() {
        return vyska;
    }

    public void setVyska(String vyska) {
        this.vyska = vyska;
    }

    public String getPlod() {
        return plod;
    }

    public void setPlod(String plod) {
        this.plod = plod;
    }

    @Override
    public String toString() {
        return "Strom{" +
                "nazov='" + nazov + '\'' +
                ", typListu='" + typListu + '\'' +
                ", vyska=" + vyska +
                ", plod='" + plod + '\'' +
                '}';
    }
}