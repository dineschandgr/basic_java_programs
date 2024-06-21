package programs.multithreading;



class MultiThread extends Thread{
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


public class ThreadExtends {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            MultiThread thread = new MultiThread();
            thread.start();
        }
    }
}