package model;

public abstract class Animal {
    private String name;
    private int age;
    private CareLevel careLevel;

    public Animal(String name, int age, CareLevel careLevel) {
        this.name = name;
        this.age = age;
        this.careLevel = careLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CareLevel getCareLevel() {
        return careLevel;
    }

    public abstract String getAnimalType();

    @Override
    public String toString() {
        return "Nome: " + name + ", Idade: " + age + ", Tipo: " + getAnimalType() +
                ", Nível de Cuidado: " + careLevel;
    }
}
