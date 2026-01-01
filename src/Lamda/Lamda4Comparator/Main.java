package Lamda.Lamda4Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(54);
        list.add(9);
        list.add(10);

//        Collections.sort(list, new MyClass());
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
    }
}
