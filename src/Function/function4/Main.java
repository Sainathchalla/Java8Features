package Function.function4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Object, Object> identity = Function.identity();
        System.out.println(identity.apply("Sainath"));
    }
}
