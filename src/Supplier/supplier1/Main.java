package Supplier.supplier1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int i = 6;
        Supplier<String> supplier = () -> i <= 5 ? "Below Five" : "Above Five";

        System.out.println(supplier.get());
    }
}
