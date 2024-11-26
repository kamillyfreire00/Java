import model.*;
import service.*;
import util.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RescueService rescueService = new RescueService();

        System.out.println("Bem-vindo ao Sistema de Resgate de Animais!");

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Listar Animais");
            System.out.println("3. Mostrar Cuidados");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:

                    System.out.print("Digite o nome do animal: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite a idade do animal: ");
                    int age = scanner.nextInt();

                    System.out.print("Tipo do animal (1 - Mamífero, 2 - Ave, 3 - Réptil): ");
                    int type = scanner.nextInt();

                    try {

                        Animal animal = AnimalFactory.createAnimal(name, age, type);

                        rescueService.registerAnimal(animal);
                        System.out.println("Animal registrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:

                    List<Animal> animals = rescueService.getAnimals();
                    if (animals.isEmpty()) {
                        System.out.println("Nenhum animal registrado.");
                    } else {
                        System.out.println("Animais Registrados:");
                        for (Animal animal : animals) {
                            System.out.println(animal);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Cuidados para os Animais:");
                    for (Animal animal : rescueService.getAnimals()) {
                        System.out.println(animal.getName() + ": " + rescueService.getCareInstructions(animal));
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
