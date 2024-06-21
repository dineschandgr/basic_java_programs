package out.production.streams.api;

import java.util.stream.IntStream;

public class ParallelStreamsTest {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long count = IntStream.range(2_030_000, 2_040_000)
                .filter(x -> isPrime(x))
                .parallel()
                .count();

        System.out.println("count is "+count);

        long endTime = System.currentTimeMillis();

        System.out.println("time taken is "+(endTime - startTime));

       IntStream.range(2_030_000, 2_040_000)
                .filter(x -> isPrime(x))
                .parallel()
               .forEachOrdered(x ->System.out.println(x));
    }

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
