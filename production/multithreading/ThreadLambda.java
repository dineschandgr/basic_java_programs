package production.multithreading;

public class ThreadLambda {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(() -> {
                try {
                    System.out.println("Thread sleep "+Thread.currentThread().getId());
                    Thread.sleep(2000);
                    System.out.println("Thread awake "+Thread.currentThread().getId());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t1.start();
        }

        new Thread(() -> {
            for (int i = 1; i < 100; i += 1) {
                System.out.print("_");
            }
        }).start();

        new Thread(() -> {
            for (int i = 2; i < 100; i += 1) {
                System.out.print("*");
            }
        }).start();
    }
}
