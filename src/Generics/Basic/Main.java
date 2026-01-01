package Generics.Basic;

public class Main {
    public static void main(String[] args) {
        City<String> city = new City<>();
        city.setName("Hyd");
        System.out.println(city.getName());

        city.setName("Bng");
        System.out.println(city.getName());


        City<Integer> city2 = new City<>();
        city2.setName(21);
        System.out.println(city2.getName());
    }
}
