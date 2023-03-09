package sk.sosholic.druhypolrok.zoznamaut;

public class Automobil {
    private String znacka;
    private String obsahMotoru;
    private String typPaliva;

    public Automobil(String znacka, String obsahMotoru, String typPaliva) {
        this.znacka=znacka;
        this.obsahMotoru=obsahMotoru;
        this.typPaliva=typPaliva;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getObsahMotoru() {
        return obsahMotoru;
    }

    public void setObsahMotoru(String obsahMotoru) {
        this.obsahMotoru = obsahMotoru;
    }

    public String getTypPaliva() {
        return typPaliva;
    }

    public void setTypPaliva(String typPaliva) {
        this.typPaliva = typPaliva;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "znacka='" + znacka + '\'' +
                ", obsahMotoru='" + obsahMotoru + '\'' +
                ", typPaliva='" + typPaliva + '\'' +
                '}';
    }
}