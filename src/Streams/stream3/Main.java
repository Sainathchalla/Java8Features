package Streams.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Example - 1
//        List<Integer> list = Arrays.asList(10, 10, 8, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        // At every step a new intermediary stream is generated, then we take that stream and do next process on that stream.
//        List<Integer> list1 = list.stream().filter(n -> n % 2 == 0).map(n -> n / 2).distinct().sorted((a, b) -> b - a).limit(4).skip(1).toList();
//        System.out.println(list1);


//        Example - 2
        Stream<Integer> list2 = Stream.iterate(1, n -> n + 1).limit(10);

        Stream<Integer> peek = list2.filter(x -> x % 2 == 0).peek(x -> System.out.println(x));

        Optional<Integer> max = peek.min((a, b) -> b - a);
        System.out.println("Max Element is : " + max.get());
    }
}
