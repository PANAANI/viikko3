package main;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animal_list = new ArrayList<>();
    private String zoo_name;

    public Zoo(String _zoo_name) {
        zoo_name = _zoo_name;
    }
    public void addAnimal(Animal animal) {
        animal_list.add(animal);
    }
    public void listAnimals() {
        String printout = zoo_name + " pitää sisällään seuraavat eläimet:";
        System.out.println(printout);
        for (Animal animal : animal_list) {
            String name = animal.getName();
            String age = Integer.toString(animal.getAge());
            String species = animal.getSpecies();
            printout = species + ": " + name + ", " + age + " vuotta";
            System.out.println(printout);
        }
    }
    public void runAnimals(int iterations) {
        for (Animal animal : animal_list) {
            for (int i = 0; i < iterations; i++) {
                String name = animal.getName();
                String printout = name + " juoksee kovaa vauhtia!";
                System.out.println(printout);
            }
        }
    }
}
