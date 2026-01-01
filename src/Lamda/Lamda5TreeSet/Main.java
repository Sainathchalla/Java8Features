package Lamda.Lamda5TreeSet;

import java.util.Set;
import java.util.TreeSet;

// HashSet -> Order Never Gurantees
// LinkedHashSet -> Order Gurantees
// TreeSet -> Sorted Order

public class Main {
    public static void main(String[] args) {

//        Method - 1
//        Comparator<Integer> comparator = (a, b) -> b - a;
//        Set<Integer> set = new TreeSet<>(comparator);

//        Method - 2
        Set<Integer> set = new TreeSet<>((a, b) -> b - a);

        set.add(35);
        set.add(12);
        set.add(44);
        set.add(1);
        set.add(5);

        System.out.println(set);
    }
}
