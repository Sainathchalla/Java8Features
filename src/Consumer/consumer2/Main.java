package Consumer.consumer2;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println(s.length());
//        consumer1.accept("Sainath");

        Consumer<String> consumer2 = s -> System.out.println(s.substring(0, 3));
        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Sainath");
    }
}
