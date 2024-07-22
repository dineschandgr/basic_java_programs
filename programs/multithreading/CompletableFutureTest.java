package programs.multithreading;

import programs.streams.api.ParallelStreamsTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int i = 1000;
        int j = 2000;
        CompletableFuture<Integer> ith = CompletableFuture.supplyAsync(() -> findIthPrime(i));
        CompletableFuture<Integer> jth = CompletableFuture.supplyAsync(() -> findIthPrime(j));
        //System.out.println(ith.get());
        //System.out.println(jth.join());

        CompletableFuture<Integer> diff = ith.thenCombine(jth, (x, y) -> x - y);
        System.out.println(diff.join());


        System.out.println(CompletableFuture.<Integer>supplyAsync(() -> null)
                .thenApply(x -> x + 1)
                .handle((t,e) -> (e == null) ? t : 0)
                .thenApply(y -> y + 10)
                .join());



    }

    static int findIthPrime(int i) {
        return Stream
                .iterate(2, x -> x + 1)
                .filter(x -> ParallelStreamsTest.isPrime(x))
                .limit(i)
                .reduce((x, y) -> y)
                .orElse(0);
    }
}
