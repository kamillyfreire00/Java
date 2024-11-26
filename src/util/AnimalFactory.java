package util;

import model.*;

public class AnimalFactory {
    public static Animal createAnimal(String name, int age, int type) {
        CareLevel careLevel = CareLevel.MEDIO;

        switch (type) {
            case 1:
                return new Mammal(name, age, careLevel);
            case 2:
                return new Bird(name, age, careLevel);
            case 3:
                return new Reptile(name, age, careLevel);
            default:
                throw new IllegalArgumentException("Tipo de animal inválido!");
        }
    }
}
