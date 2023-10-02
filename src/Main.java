// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lions", "king", 10, true);
        Zoo myZoo = new Zoo("theZoo", "Tunis", 30);

        myZoo.displayZoo();
        System.out.println(myZoo);
        Animal lion2 = new Animal("lions", "Queen", 7, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion2);
        System.out.println(lion);
        System.out.println("Animaux dans le zoo:");
        myZoo.listAnimals();


        int index = myZoo.searchAnimal(lion);
        if (index != -1) {
            System.out.println("L'animal se trouve à i" + index + " dans le zoo.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }
        }
}