package main;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String new_zoo_name = sc.nextLine();
        Zoo zoo = new Zoo(new_zoo_name);
        String choice = "";
        while (choice.equals("0") == false) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            if (sc.hasNext()) {
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Mikä laji?");
                        String new_species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String new_name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int new_age = sc.nextInt();
                        Animal new_animal = new Animal(new_species, new_name, new_age);
                        zoo.addAnimal(new_animal);
                        break;
                    case "2":
                        zoo.listAnimals();
                        break;
                    case "3":
                        System.out.println("Kuinka monta kierrosta?");
                        int iterations = sc.nextInt();      
                        zoo.runAnimals(iterations);
                        break;
                    case "0":
                        System.out.println("Lopetetaan.");
                        break;
                    default:
                        System.out.println("Tuntematon valinta, yritä uudestaan.");
                        break;
                }
            }            
        }
        System.out.println("Kiitos ohjelman käytöstä.");
    } 
}
