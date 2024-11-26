package model;

public class Mammal extends Animal {
    public Mammal(String name, int age, CareLevel careLevel) {
        super(name, age, careLevel);
    }

    @Override
    public String getAnimalType() {
        return "Mamífero";
    }
}
