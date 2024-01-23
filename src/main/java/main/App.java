package main;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String new_zoo_name = sc.nextLine();
        Zoo zoo = new Zoo(new_zoo_name);
        boolean exit = false;
        while (exit == false) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            if (sc.hasNext()) {
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Mikä laji?");
                        String new_species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String new_name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int new_age = Integer.parseInt(sc.nextLine());
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
                        //System.out.println("lopetetaan.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }            
        }
        sc.close();
        System.out.println("Kiitos ohjelman käytöstä.");
    } 
}
