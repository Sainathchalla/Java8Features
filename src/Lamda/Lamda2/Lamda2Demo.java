package Lamda.Lamda2;

public class Lamda2Demo {
    public static void main(String[] args) {
        Mathematics maths = (a, b) -> a + b + 8;
        System.out.println(maths.add(3, 3));
    }
}
