package MethodandConstructorReference.ConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sainath", "Akhil", "Raju");
//        list.stream().map(s -> new Student(s));
        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}
