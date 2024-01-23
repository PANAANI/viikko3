package main;

public class Animal {
    private String species;
    private String name;
    private int age;
    public Animal(String _species, String _name, int _age) {
        species = _species;
        name = _name;
        age = _age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
}
