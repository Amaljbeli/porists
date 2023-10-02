public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int ia;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        int i;
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }
    public boolean addAnimal(Animal animal) {
        if (ia < nbrCages) {
            animals[ia] = animal;
            ia++;
            return true;
        } else {
            System.out.println("Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < ia; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public void listAnimals() {
        for (int i = 0; i < ia; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i].name);
        }
    }
}




