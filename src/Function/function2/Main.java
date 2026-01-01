package Function.function2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<List<Student>, List<Student>> function1 = (list) -> {
            List<Student> result = new ArrayList<>();
            for (Student s : list) {
                String prefix = s.getName().substring(0, 3);
                if (prefix.equalsIgnoreCase("sai")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student("Sainath", 1);
        Student s2 = new Student("Akhil", 2);
        Student s3 = new Student("Sumanth", 3);
        Student s4 = new Student("Sai Prakash", 4);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(function1.apply(list));
    }
}
