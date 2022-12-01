package sk.sosholic.prvypolrok.zoo;

public class Zviera {
    String animalType;
    double value;

    public Zviera(String animalType, double value) {
        if(value <= 0){
            this.value = 0;
        }else{
            this.value = value;
        }
        if(animalType.equals("")){
            this.animalType = "Student 3.TPI";
        }else{
            this.animalType = animalType;
        }
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Zviera{" +
                "AnimalType='" + animalType + '\'' +
                ", value=" + value +
                '}';
    }
}