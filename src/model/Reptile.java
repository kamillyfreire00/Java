package model;

public class Reptile extends Animal {
    public Reptile(String name, int age, CareLevel careLevel) {
        super(name, age, careLevel);
    }

    @Override
    public String getAnimalType() {
        return "Reptil";
    }
}

