package Generics.Intermediate;

public class Cage<T extends Cat> {
    public void sleep() {
        System.out.println("Sleeping");
    }
}
