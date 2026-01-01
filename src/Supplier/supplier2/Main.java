package Supplier.supplier2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Function<Integer, Integer> function = i -> i * i;
        Consumer<Integer> consumer = i -> System.out.println(i);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
