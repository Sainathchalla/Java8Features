package Lamda.Lamda3Thread;

public class Lamda3Demo {
    public static void main(String[] args) {
//        Runnable runnable = new Main();
//        Thread thread = new Thread(runnable);
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        });
        thread.start();
//        myClass.run();

//        Runnable runnable = () -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Hello " + i);
//            }
//        };
//        runnable.run();
    }
}
