package model;

public class Bird extends Animal {
    public Bird(String name, int age, CareLevel careLevel) {
        super(name, age, careLevel);
    }

    @Override
    public String getAnimalType() {
        return "Ave";
    }
}
