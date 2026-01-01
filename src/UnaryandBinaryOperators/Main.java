package UnaryandBinaryOperators;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

//        UnaryOperator Example -> Use UnaryOperator Instead of Function if Input and Output are same.
//        Function<String, String> function = (s) -> s.toLowerCase();
//        System.out.println(function.apply("SaiNath"));

        UnaryOperator<String> unaryOperator = (s) -> s.toLowerCase();
        System.out.println(unaryOperator.apply("SaiNath"));


//        BinaryOperator Example -> Use BinaryOperator Instead of BiFunction if Input and Output are same.

//        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + s2;
//        System.out.println(biFunction.apply("Challa ", "Sainath"));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Challa ", "Sainath"));
    }
}


