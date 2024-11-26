package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class RescueService implements CareInstructions {
    private List<Animal> animals;

    public RescueService() {
        this.animals = new ArrayList<>();
    }

    public void registerAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String getCareInstructions(Animal animal) {
        if (animal instanceof Mammal) {
            return "Cuidados para Mamíferos: Alimentação balanceada e espaço amplo.";
        } else if (animal instanceof Bird) {
            return "Cuidados para Aves: Fornecer poleiros e espaço para voar.";
        } else if (animal instanceof Reptile) {
            return "Cuidados para Répteis: Temperatura controlada e habitat específico.";
        }
        return "Cuidados gerais para animais.";
    }
}
