package production.lambda;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface funcInterface{

    void print(int x);
}

@FunctionalInterface
interface AddInterface{

    void add(int a, int b);

}

class subClass implements funcInterface{
    @Override
    public void print(int x) {
        System.out.println("val is "+x);
    }
}

public class lambdaTest {

    public static void main(String[] args) {

        //normal way
        funcInterface f = new subClass();
        f.print(5);
        //System.out.println("val is "+val);

        //anonymous inner class
        funcInterface fObj1 = new funcInterface(){
                public void print(int x) {
                    System.out.println(2 * x);
                }
        };
        fObj1.print(10);

        //lambda
        funcInterface fObj = x -> System.out.println(2 * x);
        fObj.print(5);

        AddInterface addInterface = (int n1, int n2) -> {
            System.out.println(n1 + n2);
            System.out.println("hello");
            System.out.println(n1 + n2);
        };

        addInterface.add(10,20);


        //accept 1 arg and returns true/false
        Predicate<String> p = (x) -> x.equals("test");
        System.out.println(p.test("test"));

        //accept 1 arg and no return
        Consumer<Integer> conObj = (x) -> System.out.println("Consumer value of x is "+x);
        conObj.accept(20);

        Supplier<String> suppObj = () -> "hello";
        System.out.println(suppObj.get());

        Function<Integer, Integer> funcObj = (x) -> x * x;
        System.out.println(funcObj.apply(10));

        BiFunction<Integer, Integer, Integer> biFuncObj = (x,y) ->  x * y;
        System.out.println(biFuncObj.apply(10, 30));

    }

}