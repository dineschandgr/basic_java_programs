package programs.multithreading;



class MultiThread1 implements Runnable{
    public void run(){

        System.out.println("Thread running "+Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread awake "+Thread.currentThread().getId());
    }
}


public class ThreadImplements {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {

            Thread t = new Thread(() ->{
                System.out.println("Thread running "+Thread.currentThread().getId());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread awake "+Thread.currentThread().getId());
            });
            t.start();
            // Thread.sleep(2000);
        }

    }
}