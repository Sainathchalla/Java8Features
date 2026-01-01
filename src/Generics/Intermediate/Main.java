package Generics.Intermediate;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setId(2);
        cat.setName("Pika");

        System.out.println(cat.getId() + ": " + cat.getName());

        // Here I want to create object for Cage, but Cage creator has restricted creation for child's of Cat and Cat only
        // Cannot create the cage for animal since it is not a Cat or child of Cat, gives compile time errors.
//        Cage<Animal> animalCage = new Cage<>();
        Cage<Cat> catCage = new Cage<>();
        catCage.sleep();
        Cage<Kitten> kittenCage = new Cage<>();
        kittenCage.sleep();
    }
}
