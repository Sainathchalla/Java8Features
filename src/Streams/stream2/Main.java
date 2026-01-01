package Streams.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Multiple Ways of creating a Stream

        // Method - 1 -> Arrays to Stream
        int[] arr1 = {1, 2, 3};
        IntStream integerStream = Arrays.stream(arr1);
        System.out.println(Arrays.toString(integerStream.toArray()));

        String[] strArray = {"Sai", "Raj", "Shyam"};
        Stream<String> stringStream = Arrays.stream(strArray);
        System.out.println(stringStream.toList());


        // Method - 2 -> Lists to Stream
        List<String> list = Arrays.asList("Sai", "Raj", "Sumanth");
        Stream<String> stream = list.stream();
        System.out.println(stream.toList());


        // Method - 3 -> Direct Stream Creation
        Stream<String> stringStream1 = Stream.of("Sainath", "Vijay", "Bhavish");
        System.out.println(stringStream1.toList());

        // Method - 4 -> Using Iterate -> Used to generate a stream of any Type by giving first value and formula to calculate the next element using the prev value.
        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1).limit(10);
        System.out.println(iterate.toList());

        // Method - 5 -> Using generate -> Used to generate a stream
        Stream<Integer> limit = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        System.out.println(Arrays.toString(limit.toArray()));
    }
}
