package Lamda.Lamda6TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "sai");
//        map.put(3, "abhi");
//        map.put(7, "raj");
//
//        System.out.println(map);
//
//        map.put(16, "shyam");
//
//        System.out.println(map);

        System.out.println("***********************************");

        Map<String, String> treeMap = new TreeMap<>(
                (a, b) -> b.length() - a.length()
        );
        treeMap.put("100", "sum");
        treeMap.put("1", "sai");
        treeMap.put("3", "abhi");
        treeMap.put("7", "raj");

        System.out.println(treeMap);

        treeMap.put("16", "shyam");

        System.out.println(treeMap);
    }
}
