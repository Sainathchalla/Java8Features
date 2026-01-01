package AnonymousInnnerClasses;

public class Main {

    int a = 100;

    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());


//        int a = 10;
//        Employee employee = new Employee() {
//            int a = 20;
//            @Override
//            public String getName() {
//                System.out.println(a);
//                return "Software_Engineer";
//            }
//        };
//        System.out.println(employee.getName());


//        int a = 100;
        Employee employee = () -> {
            int a = 10;
            System.out.println(a);
            return "Software_Engineer";
        };
        System.out.println(employee.getName());
    }
}
