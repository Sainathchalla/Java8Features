package BiPredicateBiFunctionBiConsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (i, s) -> i % 2 == 0 && s.length() == 7;
        System.out.println(biPredicate.test(100, "Sainath"));


        BiFunction<Integer, String, String> biFunction = (i, s) -> s.substring(0, i);
        System.out.println(biFunction.apply(3, "Sainath"));

        BiConsumer<Integer, String> biConsumer = (i, s) -> System.out.println(i + ": " + s);
        biConsumer.accept(3, "Raju");
    }
}
