package Lamda.Lamda7Student;

public class Student extends MasterStudent implements Comparable<MasterStudent> {

    int id;
    String name;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student() {
    }

//    @Override
//    public int compareTo(Student o) {
//        if (id > o.id) {
//            return 1;
//        } else if (id < o.id) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(MasterStudent o) {
        if (city.length() > o.city.length()) {
            return 1;
        } else if (city.length() < o.city.length()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return this.id + ": " + this.name + "-> " + this.city;
    }
}
