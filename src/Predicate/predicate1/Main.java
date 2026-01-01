package Predicate.predicate1;

import java.util.function.Predicate;


//Predicate is used when we want to validate the objects with pre-defined rules.
public class Main {
    public static void main(String[] args) {

//        Predicate<Student> predicate = (student) -> {
//            if (student.getMarks() > 60) {
//                System.out.println(student.getName() + " is passed");
//                return true;
//            } else {
//                System.out.println(student.getName() + " is failed");
//                return false;
//            }
//        };

        Predicate<Student> predicate = (student) -> student.getMarks() > 60;

        Student student1 = new Student("Sai", 70);
        Student student2 = new Student("Raj", 30);

        System.out.println(predicate.test(student1));
        System.out.println(predicate.test(student2));
    }
}