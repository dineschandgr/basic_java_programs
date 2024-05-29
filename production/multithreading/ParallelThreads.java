package out.production.multithreading;

import out.production.streams.api.ParallelStreamsTest;

import java.util.stream.Stream;

public class ParallelThreads {

    public static void main(String[] args) {

        ParallelStreamsTest parallelStreamsTest = new ParallelStreamsTest();

        Stream.of(1, 2, 3, 4)
                //.parallel()
                .reduce(0, (x, y) -> {
                    System.out.println(Thread.currentThread().getName());
                    return x + y;
                });


        Thread findPrime = new Thread(() -> {
            System.out.println(
                    Stream.iterate(2, i -> i + 1)
                            .filter(i -> parallelStreamsTest.isPrime(i))
                            .limit(1_0L)
                            .reduce((x, y) -> y)
                            .orElse(null));
        });

        findPrime.start();

        while (findPrime.isAlive()) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                System.out.print("interrupted");
            }
        }
    }

}

