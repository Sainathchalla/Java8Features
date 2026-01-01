package Function.function3;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();

        System.out.println(function.apply("Sainath"));

        // Function<T, R> == T -> super of Integer && R -> extends V
        Function<Integer, String> function1 = (i) -> "Hello";

        Function<String, String> function2 = function.andThen(function1);
        System.out.println(function2.apply("Raju"));
    }
}
