package Consumer.consumer1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Consumer<String> consumer = (s) -> {
            list.add(s.length());
        };
        consumer.accept("Sainath");

        System.out.println(list);
    }
}
