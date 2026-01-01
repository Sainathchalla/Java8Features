package Predicate.predicate4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sainath", "Akhil", "Sudheer", "Samanth", "Raj", "Sumanth", "Vikas");

        Predicate<String> predicate1 = (s) -> s.toLowerCase().charAt(0) == 's';


//        Example - 1
//        Predicate<String> predicate2 = (s) -> s.toLowerCase().charAt(s.length() - 1) == 'h';
//
//        Predicate<String> resultPredicate = predicate1.and(predicate2);
//
//        long count = list.stream().filter(resultPredicate).count();
//        System.out.println(count);


//        Example - 2
        Predicate<String> resultPredicate = predicate1.negate();
        long count = list.stream().filter(resultPredicate).count();
        System.out.println(count);

    }
}
