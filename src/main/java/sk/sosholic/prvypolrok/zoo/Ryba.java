package sk.sosholic.prvypolrok.zoo;

public class Ryba extends Zviera{
    String typVody;

    public Ryba(String animalType, double value, String typVody) {
        super(animalType, value);
        this.typVody = typVody;
    }

    public String getTypVody() {
        return typVody;
    }

    public void setTypVody(String typVody) {
        this.typVody = typVody;
    }

    @Override
    public String toString() {
        return "Ryba{" +
                "typVody='" + typVody + '\'' +
                ", animalType='" + animalType + '\'' +
                ", value=" + value +
                '}';
    }
}