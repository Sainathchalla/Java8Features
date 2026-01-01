package Lamda.Lamda1;


//private int getSum(int a, int b) {
//    return a+b;
//}

//(a, b) -> a+b;

public class Lamda1Demo {

    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.sound();

        Animal animal = () -> System.out.println("Bow..Bow..");
        animal.sound();

        Animal animal2 = () -> System.out.println("Meow..Meow.");
        animal2.sound();
    }
}
