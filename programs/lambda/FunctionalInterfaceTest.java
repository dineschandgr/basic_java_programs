package programs.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        ConsumerTest c = new ConsumerTest();
        c.accept(10);

        ConsumerTest c1 = new ConsumerTest() {
            @Override
            public void accept(Integer i) {
                System.out.println("accept " + i);
            }
        };
        c1.accept(20);

        Consumer<Integer> c3 = (x) -> System.out.println("Consumer value of x is " + x);
        c3.accept(30);

        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = (a) -> a > 10;
        System.out.println(predicate.test(11));

        Function<Integer, Integer> function = (a) -> a * a;
        System.out.println(function.apply(10));

        BiFunction<Integer, Integer, Boolean> biFunction = (a,b) -> a > b;
        System.out.println(biFunction.apply(20,10));

        BiFunction<Integer, Integer, Integer> biFunction1 = (a,b) -> a + b;
        System.out.println(biFunction1.apply(20,10));
    }

}

class ConsumerTest implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.println("accept "+i);
    }
}
