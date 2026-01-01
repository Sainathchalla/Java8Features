package Predicate.predicate2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream().filter(a -> a < 5).mapToInt(a -> a).sum();
        System.out.println(sum);
    }
}
