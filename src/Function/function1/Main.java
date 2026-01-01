package Function.function1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> Integer.parseInt(s);

        System.out.println(function.apply("2"));
    }
}
