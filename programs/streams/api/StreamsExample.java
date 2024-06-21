package programs.streams.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(100,10,20,30,40,40,50);

        List<Integer> newList1 = new ArrayList<>(integerList.size());

        for(Integer i : integerList){
            newList1.add(i*4);
        }

        String s1 = integerList.stream().map(x -> String.valueOf(x)).peek(e ->
                System.out.println("peek element is " +e)).
                collect(Collectors.joining(","));

        System.out.println("string is "+s1);

        System.out.println("newList1 "+newList1);

        List<Integer> newList = integerList.stream()
                .map(x -> x * 4)
                .peek(y -> System.out.println("value after multiplication is "+y))
                .filter(x -> x > 80)
                .peek(y -> System.out.println("value after filter is "+y))
                .map(x -> x / 4)
                .peek(y -> System.out.println("value after division is "+y))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("newList "+newList);
        Set<Integer> intSet = integerList.stream().filter(x -> x > 20).collect(Collectors.toSet());
        System.out.println("intSet "+intSet);

       integerList.stream().map(x -> x * 4)
                .filter( x -> x > 100).map(y -> y / 4.5).forEach(System.out::println);


        Integer min = integerList.stream().map(x -> x * 4)
                .filter( x -> x > 100).mapToInt(y -> y / 4).min().getAsInt();

        System.out.println("min "+min);


       List<Integer> newList2 = integerList.stream().map(x -> x * 4).peek(e ->
               System.out.println("peek 1 before filter is " +e)).filter(x -> x > 80).peek(e ->
               System.out.println("peek 2 after filter is " +e)).collect(Collectors.toList());

        System.out.println();

        integerList.stream().parallel().forEach(x -> System.out.println("value of x is "+x));

        /*char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's' };*/

        char[] ch = { 'H', 'e', 'l', 'l', 'o', 'w', 'o',
                'r', 'l', 'd' };


        //Arrays.sort(ch);

        // Converting character array into string
        // using joining() method of Collectors class
        String chString
                = Stream.of(ch)
                .peek(s -> System.out.println("before join1 "+s))
                .map(arr -> new StringBuilder(String.valueOf(arr)))
                .peek(s -> System.out.println("before join2 "+s))
                .collect(Collectors.joining());


        String sorted = Stream.of(chString.split(""))
                .sorted().collect(Collectors.joining());

        System.out.println("sorted string "+sorted);


        System.out.println("org list "+integerList);
        System.out.println("new List "+newList);
        System.out.println("set is "+intSet);


        List<Integer> integerList1 = List.of(50,20,30,80,40,50,25);
        Stream<Integer> sortedList = integerList1.stream().sorted();

        List<Integer> list = sortedList.collect(Collectors.toList());
        System.out.println("sorted list is "+sortedList);

        int sum = IntStream.range(1, 100).sum();
        System.out.println("sum "+sum);


    }
}
