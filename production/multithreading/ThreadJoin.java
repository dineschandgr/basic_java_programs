package production.multithreading;


import production.multithreading.MultiThread;

class MultiThread2 extends Thread{
    public void run(){
        System.out.println("Thread running "+Thread.currentThread().getId());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread wake up "+Thread.currentThread().getId());
    }
}


public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {

            MultiThread thread1 = new MultiThread();
            MultiThread thread2 = new MultiThread();


            thread1.start();
            thread1.setName("Dinesh");
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            thread1.join();

            thread2.start();
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
    }
}