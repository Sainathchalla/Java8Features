package MethodandConstructorReference.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Sainath", "Akhil", "Pavan");
//        Consumer<String> consumer = x -> print(x);

//        StringConsumer stringConsumer = new StringConsumer();

        Consumer<String> consumer = Main::print;
        students.forEach(consumer);
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
