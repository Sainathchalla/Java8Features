package Lamda.Lamda7Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Sainath", "Hyderabad");
        Student s2 = new Student(9, "Abhi", "Banglore");
        Student s3 = new Student(4, "Raj", "Mumbai");
        Student s4 = new Student(66, "Shyam", "Jaipur");
        Student s5 = new Student(10, "Vivek", "Nellore");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

//        System.out.println(list);

        System.out.println("**********************");


//        Method - 1 -> If you want to directly use sort(), then some things you need to look into.
//                    a) filter: <T extends Comparable<? super T>>  -> Student must implement the Comparable Interface, this makes sure while sorting Students knows how to compare themselves.
//                    b) <T extends Comparable> == <Student extends Comparable> -> Student must be a child of Comparable, how come someone can become child ? By extending or implementing right.
//                    c) Comparable<? super T> == Comparable<? super Student> -> Comparable must have Student or any parent of those. Since you can not only compare students but also compare students with its parent right(they have some fields in common right, think about it).
//                    d) You can compare Child/Parent with Parent only when utilize super
        Collections.sort(list);

//        Method - 2 -> If you don't want your student class extends Comparable, there is a way.
//                      a) sort(List<Student>, Comparator<? super Student>) -> You need to pass a type comparator object.
//                      b) Comparator is a functional-Interface, We need to implement the compare() method in it.
//                      c) You can compare Parent with Parent when utilize super
//        Comparator<Student> c = (a, b) -> b.id - a.id;
//        Collections.sort(list, c);

        System.out.println(list);
    }
}
